package e11;

/* renamed from: e11.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39886m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f394681a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f394682b;

    public C39886m(@j.N String str, @j.N String str2) {
        str.getClass();
        switch (str) {
            case "vpaidInit":
            case "close":
            case "setOrientationProperties":
            case "setResizeProperties":
            case "vpaidEvent":
            case "playheadEvent":
                this.f394681a = false;
                break;
            case "playVideo":
            case "expand":
                this.f394681a = "inline".equals(str2);
                break;
            case "resize":
            case "createCalendarEvent":
            case "open":
            case "storePicture":
                this.f394681a = true;
                break;
            default:
                this.f394681a = false;
                str = "";
                break;
        }
        this.f394682b = str;
    }

    public final String toString() {
        return this.f394682b;
    }
}
