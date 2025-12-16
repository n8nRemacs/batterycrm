package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p98 implements fe0 {
    public final wg7 a;
    public final int b;

    public p98(int i, zjd zjdVar) {
        this.b = i;
        this.a = zjdVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static p98 b(int i, umb umbVar) {
        fe0 clfVar;
        String str;
        int i2 = 4;
        u4j.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = umbVar.c;
        int iA = -2;
        int i4 = 0;
        while (umbVar.a() > 8) {
            int iL = umbVar.l();
            int iL2 = umbVar.b + umbVar.l();
            umbVar.I(iL2);
            if (iL != 1414744396) {
                je0 je0Var = null;
                switch (iL) {
                    case 1718776947:
                        if (iA == 2) {
                            umbVar.K(i2);
                            int iL3 = umbVar.l();
                            int iL4 = umbVar.l();
                            umbVar.K(i2);
                            int iL5 = umbVar.l();
                            switch (iL5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                ff6 ff6Var = new ff6();
                                ff6Var.t = iL3;
                                ff6Var.u = iL4;
                                ff6Var.m = xz9.n(str);
                                clfVar = new clf(new hf6(ff6Var));
                                break;
                            } else {
                                wy1.p(iL5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                clfVar = je0Var;
                                break;
                            }
                        } else {
                            if (iA == 1) {
                                int iQ = umbVar.q();
                                String str2 = iQ != 1 ? iQ != 85 ? iQ != 255 ? iQ != 8192 ? iQ != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iQ2 = umbVar.q();
                                    int iL6 = umbVar.l();
                                    umbVar.K(6);
                                    int iQ3 = umbVar.q();
                                    String str3 = zxg.a;
                                    int iF = zxg.F(iQ3, ByteOrder.LITTLE_ENDIAN);
                                    int iQ4 = umbVar.a() > 0 ? umbVar.q() : 0;
                                    ff6 ff6Var2 = new ff6();
                                    ff6Var2.m = xz9.n(str2);
                                    ff6Var2.E = iQ2;
                                    ff6Var2.F = iL6;
                                    if (str2.equals("audio/raw") && iF != 0) {
                                        ff6Var2.G = iF;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iQ4 > 0) {
                                        byte[] bArr = new byte[iQ4];
                                        umbVar.h(0, bArr, iQ4);
                                        ff6Var2.p = wg7.m(bArr);
                                    }
                                    clfVar = new clf(new hf6(ff6Var2));
                                    break;
                                } else {
                                    wy1.p(iQ, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                a8i.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + zxg.I(iA));
                            }
                            clfVar = je0Var;
                        }
                    case 1751742049:
                        int iL7 = umbVar.l();
                        umbVar.K(8);
                        int iL8 = umbVar.l();
                        int iL9 = umbVar.l();
                        umbVar.K(i2);
                        umbVar.l();
                        umbVar.K(12);
                        clfVar = new ie0(iL7, iL8, iL9);
                        break;
                    case 1752331379:
                        int iL10 = umbVar.l();
                        umbVar.K(12);
                        umbVar.l();
                        int iL11 = umbVar.l();
                        int iL12 = umbVar.l();
                        umbVar.K(i2);
                        int iL13 = umbVar.l();
                        int iL14 = umbVar.l();
                        umbVar.K(i2);
                        je0Var = new je0(iL10, iL11, iL12, iL13, iL14, umbVar.l());
                        clfVar = je0Var;
                        break;
                    case 1852994675:
                        clfVar = new mlf(umbVar.v(umbVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        clfVar = je0Var;
                        break;
                }
            } else {
                clfVar = b(umbVar.l(), umbVar);
            }
            if (clfVar != null) {
                if (clfVar.getType() == 1752331379) {
                    iA = ((je0) clfVar).a();
                }
                int i5 = i4 + 1;
                int iH = mg7.h(objArrCopyOf.length, i5);
                if (iH > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
                }
                objArrCopyOf[i4] = clfVar;
                i4 = i5;
            }
            umbVar.J(iL2);
            umbVar.I(i3);
            i2 = 4;
        }
        return new p98(i, wg7.h(i4, objArrCopyOf));
    }

    public final fe0 a(Class cls) {
        t76 t76VarListIterator = this.a.listIterator(0);
        while (t76VarListIterator.hasNext()) {
            fe0 fe0Var = (fe0) t76VarListIterator.next();
            if (fe0Var.getClass() == cls) {
                return fe0Var;
            }
        }
        return null;
    }

    @Override // defpackage.fe0
    public final int getType() {
        return this.b;
    }
}
