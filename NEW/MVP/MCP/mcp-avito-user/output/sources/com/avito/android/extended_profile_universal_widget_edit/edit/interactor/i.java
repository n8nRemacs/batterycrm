package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import Y41.p;
import Y61.l;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.photo_storage.SharedPhotosStorage;
import java.io.IOException;
import java.io.InputStream;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: UniversalWidgetImageCropper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroid/net/Uri;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroid/net/Uri;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetImageCropper$cropImageToAspectRatioIfNeed$2", f = "UniversalWidgetImageCropper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super Uri>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j f153916q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Uri f153917r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UniversalWidgetSectionModel.ImageWithTextImageRatio f153918s;

    /* compiled from: UniversalWidgetImageCropper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UniversalWidgetSectionModel.ImageWithTextImageRatio.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio2 = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio3 = UniversalWidgetSectionModel.ImageWithTextImageRatio.f153584b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Uri uri, UniversalWidgetSectionModel.ImageWithTextImageRatio imageWithTextImageRatio, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f153916q = jVar;
        this.f153917r = uri;
        this.f153918s = imageWithTextImageRatio;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f153916q, this.f153917r, this.f153918s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Uri> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) throws IOException {
        float f12;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        j jVar = this.f153916q;
        ContentResolver contentResolver = jVar.f153919a.getContentResolver();
        Uri uri = this.f153917r;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        int width = bitmapDecodeStream.getWidth();
        int height = bitmapDecodeStream.getHeight();
        int iOrdinal = this.f153918s.ordinal();
        if (iOrdinal == 0) {
            f12 = 1.0f;
        } else if (iOrdinal == 1) {
            f12 = 1.3333334f;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return uri;
                }
                throw new NoWhenBranchMatchedException();
            }
            f12 = 0.75f;
        }
        float f13 = width;
        float f14 = height;
        Q q12 = f13 / f14 > f12 ? new Q(Boxing.boxInt((int) (f14 * f12)), Boxing.boxInt(height)) : new Q(Boxing.boxInt(width), Boxing.boxInt((int) (f13 / f12)));
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        if (iIntValue == width && iIntValue2 == height) {
            return uri;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, (width - iIntValue) / 2, (height - iIntValue2) / 2, iIntValue, iIntValue2);
        Uri uriA = SharedPhotosStorage.c.a(jVar.f153921c, bitmapCreateBitmap, null, null, 30);
        bitmapDecodeStream.recycle();
        bitmapCreateBitmap.recycle();
        return uriA;
    }
}
