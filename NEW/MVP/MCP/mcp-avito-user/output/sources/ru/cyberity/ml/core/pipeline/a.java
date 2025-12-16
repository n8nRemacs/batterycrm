package ru.cyberity.ml.core.pipeline;

import Y61.k;
import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: BitmapToIntArrayOp.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lru/cyberity/ml/core/pipeline/a;", "Lru/cyberity/ml/core/pipeline/core/c;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/core/pipeline/a$a;", "input", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends ru.cyberity.ml.core.pipeline.core.c<Bitmap, C12572a> {

    /* compiled from: BitmapToIntArrayOp.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lru/cyberity/ml/core/pipeline/a$a;", "", "", "a", "I", "c", "()I", "width", "b", "height", "", "[I", "()[I", "pixels", "<init>", "(II[I)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.core.pipeline.a$a, reason: collision with other inner class name */
    public static final class C12572a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @k
        private final int[] pixels;

        public C12572a(int i12, int i13, @k int[] iArr) {
            this.width = i12;
            this.height = i13;
            this.pixels = iArr;
        }

        /* renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final int[] getPixels() {
            return this.pixels;
        }

        /* renamed from: c, reason: from getter */
        public final int getWidth() {
            return this.width;
        }
    }

    @Override // ru.cyberity.ml.core.pipeline.core.c
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C12572a b(@k Bitmap input) {
        int[] iArr = new int[input.getHeight() * input.getWidth()];
        input.getPixels(iArr, 0, input.getWidth(), 0, 0, input.getWidth(), input.getHeight());
        return new C12572a(input.getWidth(), input.getHeight(), iArr);
    }
}
