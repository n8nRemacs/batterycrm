package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class cd8 extends bdf {
    public final /* synthetic */ rf7 X;
    public final /* synthetic */ dd8 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd8(dd8 dd8Var, hj0 hj0Var, rac racVar, oac oacVar, rf7 rf7Var) {
        super(hj0Var, racVar, oacVar, "LocalExifThumbnailProducer");
        this.Y = dd8Var;
        this.X = rf7Var;
    }

    @Override // defpackage.bdf
    public final void b(Object obj) {
        ce5.d((ce5) obj);
    }

    @Override // defpackage.bdf
    public final Map c(Object obj) {
        return bh7.a("createdThumbnail", Boolean.toString(((ce5) obj) != null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: IOException -> 0x000f, StackOverflowError -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x000f, StackOverflowError -> 0x004c, blocks: (B:5:0x0011, B:7:0x001c, B:9:0x0022, B:10:0x0028, B:12:0x0034, B:16:0x003e), top: B:70:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // defpackage.bdf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd8.d():java.lang.Object");
    }
}
