package Ba1;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: Ba1.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13129g extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f1500q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bitmap f1501r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13129g(Context context, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f1500q = context;
        this.f1501r = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C13129g(this.f1500q, this.f1501r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C13129g) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        File file = new File(this.f1500q.getCacheDir(), "photo_" + System.currentTimeMillis() + ".jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            this.f1501r.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            kotlin.io.c.a(fileOutputStream, null);
            return file;
        } finally {
        }
    }
}
