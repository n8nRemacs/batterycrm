package com.avito.android.rating_form.select_item;

import Y41.l;
import Y41.p;
import Y61.k;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import com.avito.android.rating_form.select_item.RatingFormSelectItemFragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: DebouncedTextWatcher.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/select_item/a;", "Landroid/text/TextWatcher;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC22983P f248894b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<String, G0> f248895c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f248896d;

    /* compiled from: DebouncedTextWatcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.select_item.DebouncedTextWatcher$onTextChanged$1", f = "DebouncedTextWatcher.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.rating_form.select_item.a$a, reason: collision with other inner class name */
    public static final class C7475a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f248897q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f248899s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7475a(String str, Continuation<? super C7475a> continuation) {
            super(2, continuation);
            this.f248899s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return a.this.new C7475a(this.f248899s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C7475a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f248897q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f248897q = 1;
                if (C43131e0.b(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            String str = aVar.f248896d;
            String str2 = this.f248899s;
            if (!str2.equals(str)) {
                return G0.f406611a;
            }
            ((RatingFormSelectItemFragment.d) aVar.f248895c).invoke(str2);
            return G0.f406611a;
        }
    }

    public a(@Y61.l Editable editable, @k InterfaceC22983P interfaceC22983P, @k l lVar) {
        String string;
        this.f248894b = interfaceC22983P;
        this.f248895c = lVar;
        this.f248896d = (editable == null || (string = editable.toString()) == null) ? "" : string;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        String string;
        String string2;
        if (charSequence == null || (string2 = charSequence.toString()) == null || (string = C43066x.A0(string2).toString()) == null) {
            string = "";
        }
        if (string.equals(this.f248896d)) {
            return;
        }
        this.f248896d = string;
        C43259k.d(C22984Q.a(this.f248894b), null, null, new C7475a(string, null), 3);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
