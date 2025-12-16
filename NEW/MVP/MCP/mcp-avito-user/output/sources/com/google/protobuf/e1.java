package com.google.protobuf;

/* compiled from: TextFormatEscaper.java */
/* loaded from: classes7.dex */
final class e1 {

    /* compiled from: TextFormatEscaper.java */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC37700t f362865a;

        public a(AbstractC37700t abstractC37700t) {
            this.f362865a = abstractC37700t;
        }
    }

    /* compiled from: TextFormatEscaper.java */
    public interface b {
    }

    public static String a(AbstractC37700t abstractC37700t) {
        a aVar = new a(abstractC37700t);
        StringBuilder sb2 = new StringBuilder(abstractC37700t.size());
        int i12 = 0;
        while (true) {
            AbstractC37700t abstractC37700t2 = aVar.f362865a;
            if (i12 >= abstractC37700t2.size()) {
                return sb2.toString();
            }
            byte bD2 = abstractC37700t2.d(i12);
            if (bD2 == 34) {
                sb2.append("\\\"");
            } else if (bD2 == 39) {
                sb2.append("\\'");
            } else if (bD2 != 92) {
                switch (bD2) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bD2 >= 32 && bD2 <= 126) {
                            sb2.append((char) bD2);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((bD2 >>> 6) & 3) + 48));
                            sb2.append((char) (((bD2 >>> 3) & 7) + 48));
                            sb2.append((char) ((bD2 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
            i12++;
        }
    }
}
