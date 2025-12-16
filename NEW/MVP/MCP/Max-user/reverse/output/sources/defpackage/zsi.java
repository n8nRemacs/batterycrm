package defpackage;

/* loaded from: classes.dex */
public enum zsi implements adi {
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    public final int a;

    zsi(int i) {
        this.a = i;
    }

    @Override // defpackage.adi
    public final int d() {
        return this.a;
    }
}
