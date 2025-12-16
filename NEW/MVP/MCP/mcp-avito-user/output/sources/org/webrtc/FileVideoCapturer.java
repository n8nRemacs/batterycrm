package org.webrtc;

import android.content.Context;
import android.os.SystemClock;
import androidx.camera.camera2.internal.G;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class FileVideoCapturer implements VideoCapturer {
    private static final String TAG = "FileVideoCapturer";
    private CapturerObserver capturerObserver;
    private final VideoReader videoReader;
    private final Timer timer = new Timer();
    private final TimerTask tickTask = new TimerTask() { // from class: org.webrtc.FileVideoCapturer.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            FileVideoCapturer.this.tick();
        }
    };

    public interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    public static class VideoReaderY4M implements VideoReader {
        private static final int FRAME_DELIMETER_LENGTH = 6;
        private static final String TAG = "VideoReaderY4M";
        private static final String Y4M_FRAME_DELIMETER = "FRAME";
        private final int frameHeight;
        private final int frameWidth;
        private final RandomAccessFile mediaFile;
        private final FileChannel mediaFileChannel;
        private final long videoStart;

        public VideoReaderY4M(String str) throws IOException, NumberFormatException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int i12 = this.mediaFile.read();
                if (i12 == -1) {
                    throw new RuntimeException(G.f("Found end of file before end of header for file: ", str));
                }
                if (i12 == 10) {
                    this.videoStart = this.mediaFileChannel.position();
                    String strSubstring = "";
                    int i13 = 0;
                    int i14 = 0;
                    for (String str2 : sb2.toString().split("[ ]")) {
                        char cCharAt = str2.charAt(0);
                        if (cCharAt == 'C') {
                            strSubstring = str2.substring(1);
                        } else if (cCharAt == 'H') {
                            i14 = Integer.parseInt(str2.substring(1));
                        } else if (cCharAt == 'W') {
                            i13 = Integer.parseInt(str2.substring(1));
                        }
                    }
                    Logging.d(TAG, "Color space: " + strSubstring);
                    if (!strSubstring.equals("420") && !strSubstring.equals("420mpeg2")) {
                        throw new IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                    }
                    if (i13 % 2 == 1 || i14 % 2 == 1) {
                        throw new IllegalArgumentException("Does not support odd width or height");
                    }
                    this.frameWidth = i13;
                    this.frameHeight = i14;
                    Logging.d(TAG, androidx.appcompat.app.r.l(i13, i14, "frame dim: (", ", ", ")"));
                    return;
                }
                sb2.append((char) i12);
            }
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public void close() throws IOException {
            try {
                this.mediaFile.close();
            } catch (IOException e12) {
                Logging.e(TAG, "Problem closing file", e12);
            }
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public VideoFrame getNextFrame() throws IOException {
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = javaI420BufferAllocate.getDataY();
            ByteBuffer dataU = javaI420BufferAllocate.getDataU();
            ByteBuffer dataV = javaI420BufferAllocate.getDataV();
            javaI420BufferAllocate.getStrideY();
            javaI420BufferAllocate.getStrideU();
            javaI420BufferAllocate.getStrideV();
            try {
                int i12 = FRAME_DELIMETER_LENGTH;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i12);
                if (this.mediaFileChannel.read(byteBufferAllocate) < i12) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(byteBufferAllocate) < i12) {
                        throw new RuntimeException("Error looping video");
                    }
                }
                String str = new String(byteBufferAllocate.array(), Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new VideoFrame(javaI420BufferAllocate, 0, nanos);
                }
                throw new RuntimeException("Frames should be delimited by FRAME plus newline, found delimter was: '" + str + "'");
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }
    }

    public FileVideoCapturer(String str) throws IOException {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e12) {
            Logging.d(TAG, "Could not open video file: " + str);
            throw e12;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        this.videoReader.close();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i12, int i13, int i14) {
        this.timer.schedule(this.tickTask, 0L, 1000 / i14);
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        this.timer.cancel();
    }

    public void tick() {
        VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i12, int i13, int i14) {
    }
}
