package com.avito.android.data_picker_show.deeplink;

import Y41.p;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.data_picker_show.DataPickerArgs;
import com.avito.android.data_picker_show.DataPickerBody;
import com.avito.android.data_picker_show.DataPickerShowLink;
import com.avito.android.data_picker_show.datapickershow.DataPickerShowFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import rv.C47919b;

/* compiled from: DataPickerShowLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/data_picker_show/deeplink/a;", "Lev/a;", "Lcom/avito/android/data_picker_show/DataPickerShowLink;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<DataPickerShowLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.data_picker_show.a f132529f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f132530g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.f f132531h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f132532i;

    /* compiled from: DataPickerShowLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.data_picker_show.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3966a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            a aVar = (a) this.receiver;
            aVar.getClass();
            Bundle bundle = c47919b.f437159b;
            DataPickerShowFragment.Result result = (DataPickerShowFragment.Result) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("data_picker.result_key", DataPickerShowFragment.Result.class) : bundle.getParcelable("data_picker.result_key"));
            aVar.j(result instanceof DataPickerShowFragment.Result.Success ? new DataPickerShowLink.b.C3965b(((DataPickerShowFragment.Result.Success) result).f132485b) : DataPickerShowLink.b.a.f132469b);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k com.avito.android.data_picker_show.a aVar, @k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f132529f = aVar;
        this.f132530g = dVar;
        this.f132531h = fVar;
        this.f132532i = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DataPickerBody dataPickerBody = ((DataPickerShowLink) deepLink).f132468b;
        this.f132530g.w1(this.f132529f.a(new DataPickerArgs(dataPickerBody.f(), dataPickerBody.e(), dataPickerBody.getDivider(), dataPickerBody.getTitle(), dataPickerBody.getButtonText()), this.f395444b), "DataPickerShowFragment" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C3966a(2, this, a.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f132531h.l1(this.f395444b))), this.f132532i);
    }
}
