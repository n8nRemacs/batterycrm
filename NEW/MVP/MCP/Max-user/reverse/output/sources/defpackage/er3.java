package defpackage;

import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import one.video.upload.UploadUrlExpiredException;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final /* synthetic */ class er3 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr3 b;

    public /* synthetic */ er3(fr3 fr3Var, int i) {
        this.a = i;
        this.b = fr3Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        String line;
        switch (this.a) {
            case 0:
                ayf ayfVar = (ayf) obj;
                fr3 fr3Var = this.b;
                uaj uajVar = fr3Var.e;
                lk6 lk6Var = fr3Var.k;
                int i2 = fr3Var.i;
                uaj.a(uajVar, i2 == 4 || i2 == 7, yvg.CONNECTION_WRONG_STATE_IN_READY_FOR_READ);
                ByteBuffer byteBuffer = (ByteBuffer) lk6Var.d;
                HashMap map = (HashMap) lk6Var.c;
                uy5 uy5Var = ayfVar.a;
                yxf yxfVar = (yxf) uy5Var.Y;
                SocketChannel socketChannel = (SocketChannel) uy5Var.b;
                if (yxfVar == null) {
                    i = socketChannel.read(byteBuffer);
                } else {
                    ByteBuffer byteBuffer2 = yxfVar.c;
                    SSLEngine sSLEngine = yxfVar.a;
                    byteBuffer2.compact();
                    int i3 = socketChannel.read(byteBuffer2);
                    if (i3 == -1) {
                        throw new IOException();
                    }
                    if (i3 == 0) {
                        i = 0;
                    } else {
                        byteBuffer2.flip();
                        int iBytesProduced = 0;
                        while (true) {
                            if (byteBuffer2.hasRemaining()) {
                                SSLEngineResult sSLEngineResultUnwrap = sSLEngine.unwrap(byteBuffer2, byteBuffer);
                                sSLEngineResultUnwrap.toString();
                                if (sSLEngineResultUnwrap.getStatus() == SSLEngineResult.Status.OK) {
                                    iBytesProduced += sSLEngineResultUnwrap.bytesProduced();
                                } else if (sSLEngineResultUnwrap.getStatus() != SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                                    String str = "TLS engine.unwrap error. res: " + sSLEngineResultUnwrap;
                                    uy5Var.a(str);
                                    throw new IOException(str);
                                }
                            }
                        }
                        i = iBytesProduced;
                    }
                }
                if (i == -1) {
                    throw new IOException();
                }
                if (byteBuffer.position() > 0) {
                    map.clear();
                    lk6Var.b = -1;
                    String str2 = new String(byteBuffer.array(), 0, byteBuffer.position(), lb2.a);
                    BufferedReader bufferedReader = new BufferedReader(new StringReader(str2));
                    boolean z2 = true;
                    while (true) {
                        String line2 = bufferedReader.readLine();
                        if (line2 != null) {
                            if (z2) {
                                if (line2.length() >= 12) {
                                    try {
                                        lk6Var.b = Integer.parseInt(line2.substring(9).substring(0, 3));
                                        z2 = false;
                                    } catch (NumberFormatException e) {
                                        Log.e("HTTPResponseReader", "HTTP_STATUS_CODE_EXCEPTION: ".concat(str2));
                                        throw new IOException(e);
                                    }
                                } else {
                                    continue;
                                }
                            } else if (line2.length() > 0) {
                                List listS = vmf.S(line2, new String[]{": "}, 6);
                                if (listS.size() > 1) {
                                    map.put(listS.get(0), listS.get(1));
                                }
                            } else {
                                String str3 = (String) map.get(HTTP.TRANSFER_ENCODING);
                                String str4 = (String) map.get(HTTP.CONTENT_LEN);
                                if (str4 != null) {
                                    long j = Long.parseLong(str4);
                                    if (bufferedReader.skip(j) == j) {
                                        z = true;
                                    }
                                } else if (HTTP.CHUNK_CODING.equals(str3) && (line = bufferedReader.readLine()) != null) {
                                    while (!line.equals("0")) {
                                        if (line.length() > 0) {
                                            ozi.a(16);
                                            long j2 = Long.parseLong(line, 16);
                                            if (j2 == bufferedReader.skip(j2) && bufferedReader.readLine() != null && (line = bufferedReader.readLine()) != null) {
                                            }
                                        }
                                    }
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    int i4 = lk6Var.b;
                    if (500 <= i4 && i4 < 600) {
                        throw new IOException(ho7.f(lk6Var.b, "http error code: "));
                    }
                    if (400 <= i4 && i4 < 500) {
                        throw new UploadUrlExpiredException();
                    }
                    int i5 = fr3Var.i;
                    if (i5 == 4) {
                        uaj.a(uajVar, fr3Var.m == null, yvg.CONNECTION_UPLOAD_STATUS_IS_NULL);
                        ng4 ng4Var = new ng4(fr3Var.b, lk6Var);
                        fr3Var.e("Upload status: " + ng4Var);
                        uaj.a(uajVar, fr3Var.l == null, yvg.CONNECTION_UPLOAD_CHUNK_IS_NULL);
                        fr3Var.a(ng4Var);
                        fr3Var.m = ng4Var;
                    } else if (i5 == 7) {
                        uaj.a(uajVar, fr3Var.m != null, yvg.CONNECTION_UPLOAD_STATUS_IS_NOT_NULL);
                        ng4 ng4Var2 = fr3Var.m;
                        fr3Var.e("Chunk status " + lk6Var.b);
                        int i6 = lk6Var.b;
                        if (i6 == 201) {
                            fr3Var.a(ng4Var2);
                        } else if (i6 == 200) {
                            ng4Var2.c = true;
                            fr3Var.b();
                        }
                    }
                    lk6Var.b = -1;
                    map.clear();
                    ((ByteBuffer) lk6Var.d).clear();
                }
                return qqg.a;
            default:
                fr3 fr3Var2 = this.b;
                uaj uajVar2 = fr3Var2.e;
                byf byfVar = (byf) obj;
                ng4 ng4Var3 = fr3Var2.m;
                uy5 uy5Var2 = fr3Var2.j;
                if (ng4Var3 == null) {
                    uaj.a(uajVar2, fr3Var2.i == 3, yvg.CONNECTION_WRONG_STATE_CONNECTED);
                    fr3Var2.e("Request upload status");
                    if (byfVar.a(ByteBuffer.wrap((byte[]) fr3Var2.o.getValue())) > 0) {
                        fr3Var2.h(4);
                        ((SocketChannel) uy5Var2.b).register((Selector) uy5Var2.c, 1, (fr3) uy5Var2.d);
                    }
                } else {
                    c93 c93Var = fr3Var2.l;
                    if (c93Var != null) {
                        long j3 = c93Var.b;
                        long j4 = c93Var.a;
                        int i7 = fr3Var2.i;
                        uaj.a(uajVar2, i7 == 5 || i7 == 6, yvg.CONNECTION_WRONG_STATE_IN_READY_FOR_WRITE);
                        int i8 = fr3Var2.i;
                        if (i8 == 5) {
                            String str5 = fr3Var2.h;
                            String str6 = fr3Var2.f;
                            String str7 = fr3Var2.c;
                            long j5 = fr3Var2.b;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
                            printWriter.write("POST ");
                            printWriter.write(str5);
                            printWriter.write(" HTTP/1.1\n");
                            printWriter.write("Host: ");
                            printWriter.write(str6);
                            printWriter.write("\n");
                            printWriter.write("Content-Type: application/x-binary; charset=x-user-defined\n");
                            printWriter.write("Content-Disposition: attachment; fileName=\"" + str7 + "\"\n");
                            long j6 = (j4 + j3) - 1;
                            StringBuilder sbL = az1.l(j4, "Content-Range: bytes ", "-");
                            sbL.append(j6);
                            printWriter.write(u45.i(j5, "/", "\n", sbL));
                            printWriter.write("Content-Length: " + j3 + "\n");
                            printWriter.write("X-Uploading-Mode: parallel\n");
                            printWriter.write("Connection: keep-alive\n");
                            printWriter.write("\n");
                            printWriter.flush();
                            if (byfVar.a(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())) > 0) {
                                fr3Var2.e("Upload request headers sent");
                                fr3Var2.h(6);
                            }
                        } else if (i8 == 6) {
                            byte[] bArr = fr3Var2.p;
                            RandomAccessFile randomAccessFile = fr3Var2.a;
                            while (true) {
                                long j7 = c93Var.c;
                                if (j7 < j3) {
                                    long j8 = j4 + j7;
                                    int iMin = Math.min((int) (j3 - j7), 8096);
                                    randomAccessFile.seek(j8);
                                    int i9 = randomAccessFile.read(bArr, 0, iMin);
                                    if (i9 == -1) {
                                        Log.e("UploadConnection", "[" + fr3Var2.d + "] file read error");
                                        throw new RuntimeException("Upload file read error");
                                    }
                                    int iA = byfVar.a(ByteBuffer.wrap(bArr, 0, i9));
                                    if (iA == 0) {
                                        StringBuilder sbL2 = az1.l(c93Var.c, "Upload chunk: ", " of ");
                                        sbL2.append(j3);
                                        fr3Var2.e(sbL2.toString());
                                    } else {
                                        c93Var.c += iA;
                                    }
                                }
                            }
                            if (c93Var.a()) {
                                fr3Var2.e("Upload chunk: completed");
                            }
                            if (c93Var.a()) {
                                fr3Var2.h(7);
                                fr3Var2.l = null;
                                ((SocketChannel) uy5Var2.b).register((Selector) uy5Var2.c, 1, (fr3) uy5Var2.d);
                            }
                        }
                    }
                }
                return qqg.a;
        }
    }
}
