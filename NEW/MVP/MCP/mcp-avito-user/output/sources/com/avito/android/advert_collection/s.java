package com.avito.android.advert_collection;

import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.I5;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: AdvertCollectionView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_collection.AdvertCollectionViewImpl$observeState$1", f = "AdvertCollectionView.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f81694q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f81695r;

    /* compiled from: AdvertCollectionView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z f81696b;

        public a(z zVar) {
            this.f81696b = zVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            AdvertCollectionState advertCollectionState = (AdvertCollectionState) obj;
            z zVar = this.f81696b;
            com.avito.konveyor.util.a.a(zVar.f81706d, advertCollectionState.f81615b);
            zVar.f81705c.notifyDataSetChanged();
            Toolbar toolbar = zVar.f81718p;
            MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.share);
            AdvertCollectionState.Actions actions = advertCollectionState.f81619f;
            menuItemFindItem.setVisible(actions.f81624e);
            toolbar.getMenu().findItem(R.id.more).setVisible(actions.f81621b != null || actions.f81623d || actions.f81626g || actions.f81627h);
            zVar.f81715m.setRefreshing(advertCollectionState.f81618e);
            zVar.f81717o.setVisibility(actions.f81622c != null ? 0 : 8);
            com.avito.android.lib.design.button.b.a(zVar.f81716n, zVar.f81704b.getContext().getString(R.string.add_item_button_title), false);
            AdvertCollectionState.SocialInfo socialInfo = advertCollectionState.f81620g;
            boolean z12 = socialInfo.f81632b;
            boolean z13 = actions.f81625f;
            int i12 = z13 ? 0 : 8;
            CheckableImageButton checkableImageButton = zVar.f81719q;
            checkableImageButton.setVisibility(i12);
            int i13 = z13 ? 0 : 8;
            TextView textView = zVar.f81720r;
            textView.setVisibility(i13);
            checkableImageButton.setChecked(z12);
            I5.a(textView, socialInfo.f81633c, false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f81695r = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new s(this.f81695r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f81694q;
        if (i12 == 0) {
            C42729a0.b(obj);
            z zVar = this.f81695r;
            n2<AdvertCollectionState> state = zVar.f81707e.getState();
            a aVar = new a(zVar);
            this.f81694q = 1;
            if (state.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
