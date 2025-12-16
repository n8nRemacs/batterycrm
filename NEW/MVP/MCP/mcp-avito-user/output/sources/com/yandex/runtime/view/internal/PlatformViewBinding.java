package com.yandex.runtime.view.internal;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.Surface;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.internal.ArchiveWriter;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class PlatformViewBinding {
    private static final String LOG_TAG = "PlatformViewBinding";
    private NativeObject nativeObject;
    private boolean noninteractive = false;
    private ArchiveWriter touchEventWriter = new ArchiveWriter();

    public PlatformViewBinding(PlatformGLRenderer platformGLRenderer, int i12, int i13) {
        this.nativeObject = createGLNative(platformGLRenderer, i12, i13);
    }

    private static native NativeObject createGLNative(PlatformGLRenderer platformGLRenderer, int i12, int i13);

    private static native NativeObject createVulkanNative(PlatformVulkanRenderer platformVulkanRenderer, int i12, int i13);

    private native void onSerializedTouchEventNative(ByteBuffer byteBuffer, int i12);

    public native void addSurface(int i12, Surface surface);

    public native void addSurface(int i12, Surface surface, PointF pointF);

    public void destroyNative() {
        this.nativeObject.reset();
    }

    public NativeObject getNative() {
        return this.nativeObject;
    }

    public native void onContextCreated();

    public native void onMemoryWarning();

    public native void onPause();

    public native void onResume();

    public native void onSizeChanged(int i12, int i13);

    public native void onStart(int i12, int i13);

    public native void onStop();

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.noninteractive || !TouchEvent.isTouchEvent(motionEvent) || this.nativeObject.isEmpty()) {
            return false;
        }
        TouchEvent.serialize(motionEvent, this.touchEventWriter);
        ByteBuffer byteBufferData = this.touchEventWriter.data();
        onSerializedTouchEventNative(byteBufferData, byteBufferData.position());
        byteBufferData.clear();
        return true;
    }

    public native void removeSurface(int i12);

    public native void requestRenderNative();

    public void setNoninteractive(boolean z12) {
        this.noninteractive = z12;
    }

    public PlatformViewBinding(PlatformVulkanRenderer platformVulkanRenderer, int i12, int i13) {
        this.nativeObject = createVulkanNative(platformVulkanRenderer, i12, i13);
    }
}
