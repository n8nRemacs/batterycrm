package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message;

import Y41.p;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22192v1;
import com.akita.compose.component.slider.q;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VoiceMessageContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.VoiceMessageContentKt$DurationBar$1$1", f = "VoiceMessageContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f192659q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I3<m> f192660r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f192661s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f192662t;

    /* compiled from: VoiceMessageContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<m> f192663l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I3<m> i32) {
            super(0);
            this.f192663l = i32;
        }

        @Override // Y41.a
        public final Integer invoke() {
            float f12 = l.f192690a;
            return Integer.valueOf(this.f192663l.getF42167b().f192698f);
        }
    }

    /* compiled from: VoiceMessageContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "playbackProgress", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.VoiceMessageContentKt$DurationBar$1$1$2", f = "VoiceMessageContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ int f192664q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ q f192665r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f192665r = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f192665r, continuation);
            bVar.f192664q = ((Number) obj).intValue();
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(Integer num, Continuation<? super G0> continuation) {
            return ((b) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            int i12 = this.f192664q;
            q qVar = this.f192665r;
            if (!((Boolean) ((C22082i3) qVar.f62742e).getF42167b()).booleanValue()) {
                qVar.d(i12);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VoiceMessageContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.c$c, reason: collision with other inner class name */
    public static final class C5690c extends N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f192666l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5690c(InterfaceC22192v1 interfaceC22192v1) {
            super(0);
            this.f192666l = interfaceC22192v1;
        }

        @Override // Y41.a
        public final Float invoke() {
            float f12 = l.f192690a;
            return Float.valueOf(this.f192666l.f());
        }
    }

    /* compiled from: VoiceMessageContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.VoiceMessageContentKt$DurationBar$1$1$4", f = "VoiceMessageContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<Float, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ q f192667q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f192668r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q qVar, InterfaceC22192v1 interfaceC22192v1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f192667q = qVar;
            this.f192668r = interfaceC22192v1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(this.f192667q, this.f192668r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(Float f12, Continuation<? super G0> continuation) {
            return ((d) create(Float.valueOf(f12.floatValue()), continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            q qVar = this.f192667q;
            if (((Boolean) ((C22082i3) qVar.f62742e).getF42167b()).booleanValue()) {
                float f12 = l.f192690a;
                qVar.d(this.f192668r.f());
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(I3<m> i32, q qVar, InterfaceC22192v1 interfaceC22192v1, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f192660r = i32;
        this.f192661s = qVar;
        this.f192662t = interfaceC22192v1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f192660r, this.f192661s, this.f192662t, continuation);
        cVar.f192659q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f192659q;
        InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(this.f192660r));
        q qVar = this.f192661s;
        C43175k.K(new C43197r1(new b(qVar, null), interfaceC43160iN), t12);
        InterfaceC22192v1 interfaceC22192v1 = this.f192662t;
        C43175k.K(new C43197r1(new d(qVar, interfaceC22192v1, null), C22126m3.n(new C5690c(interfaceC22192v1))), t12);
        return G0.f406611a;
    }
}
