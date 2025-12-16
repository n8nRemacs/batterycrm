package defpackage;

/* loaded from: classes2.dex */
public final class uz2 {
    public final long a;
    public final int b;
    public final CharSequence c;

    public uz2(long j, int i, CharSequence charSequence) {
        this.a = j;
        this.b = i;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz2)) {
            return false;
        }
        uz2 uz2Var = (uz2) obj;
        return this.a == uz2Var.a && this.b == uz2Var.b && this.c.equals(uz2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + utb.k(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sbL = az1.l(this.a, "ChatTyping(chatId=", ", type=");
        switch (this.b) {
            case 1:
                str = "TEXT";
                break;
            case 2:
                str = "AUDIO";
                break;
            case 3:
                str = "VIDEO_MSG";
                break;
            case 4:
                str = "STICKER";
                break;
            case 5:
                str = "FILE";
                break;
            case 6:
                str = "PHOTO";
                break;
            case 7:
                str = "VIDEO";
                break;
            default:
                str = "null";
                break;
        }
        sbL.append(str);
        sbL.append(", typingText=");
        sbL.append((Object) this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
