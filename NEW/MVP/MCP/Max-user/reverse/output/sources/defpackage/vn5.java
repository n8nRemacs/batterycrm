package defpackage;

import org.apache.http.util.VersionInfo;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class vn5 implements co5 {
    public final int a;

    public vn5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn5) && this.a == ((vn5) obj).a;
    }

    public final int hashCode() {
        return az1.v(this.a);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Failed(reason=");
        switch (this.a) {
            case 1:
                str = VersionInfo.UNAVAILABLE;
                break;
            case 2:
                str = "BUSY";
                break;
            case 3:
                str = "PRIVACY";
                break;
            case 4:
                str = "FAILED";
                break;
            case 5:
                str = "CONNECTION_ERROR";
                break;
            case 6:
                str = "REMOVE_FROM_CALL";
                break;
            case 7:
                str = "REMOVE_FROM_WAITING_ROOM";
                break;
            case 8:
                str = "TARGET_USER_NOT_IN_CHAT";
                break;
            case 9:
                str = "CALL_WAIT_ADMIN";
                break;
            case 10:
                str = "USER_RESTRICTED_CALL";
                break;
            case 11:
                str = "REJECT_CALL";
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                str = "FAILED_JOIN";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
