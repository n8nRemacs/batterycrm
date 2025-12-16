package defpackage;

/* loaded from: classes.dex */
public final class d14 {
    public final int a;
    public final boolean b;

    public d14(int i) {
        this.a = i;
        this.b = i == 2 || i == 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d14) && this.a == ((d14) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (az1.v(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContactsBannerListItem(bannerType=");
        switch (this.a) {
            case 1:
                str = "PERMIT_PHONE_BOOK_CONTACTS_BIG";
                break;
            case 2:
                str = "PERMIT_PHONE_BOOK_CONTACTS_COMPACT";
                break;
            case 3:
                str = "PERMIT_PHONE_BOOK_CONTACTS_MIDDLE";
                break;
            case 4:
                str = "PERMIT_NOTIFICATIONS_CONTACTS_MIDDLE";
                break;
            case 5:
                str = "PERMIT_NOTIFICATIONS_CONTACTS_COMPACT";
                break;
            case 6:
                str = "PERMIT_MIC_MIDDLE";
                break;
            case 7:
                str = "PERMIT_MIC_COMPACT";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", isCloseable=false)");
        return sb.toString();
    }
}
