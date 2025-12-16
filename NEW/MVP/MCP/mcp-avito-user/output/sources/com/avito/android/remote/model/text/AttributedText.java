package com.avito.android.remote.model.text;

import K51.d;
import Y41.p;
import Y61.k;
import Y61.l;
import aW.InterfaceC19825c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deep_linking.links.x;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AttributedText.kt */
@d
@InterfaceC19825c
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ \u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001dR&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u00107R*\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u00107\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bA\u0010B\u0012\u0004\bG\u00107\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR#\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0H8F¢\u0006\f\u0012\u0004\bK\u00107\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/avito/android/remote/model/text/AttributedText;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/avito/android/remote/model/text/Attribute;", Navigation.ATTRIBUTES, "", "version", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "name", "Lcom/avito/android/remote/model/text/OnClickListener;", "listener", "Lkotlin/G0;", "setOnClickListener", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/OnClickListener;)V", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/deep_linking/links/DeepLink;", "linkClicksV3", "()Lio/reactivex/rxjava3/core/z;", "Lkotlinx/coroutines/flow/i;", "linkClicks", "()Lkotlinx/coroutines/flow/i;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/util/List;I)Lcom/avito/android/remote/model/text/AttributedText;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getAttributes", "I", "getVersion", "", "_clickListeners", "Ljava/util/Map;", "get_clickListeners$annotations", "()V", "Lcom/avito/android/deep_linking/links/w;", "onDeepLinkClickListener", "Lcom/avito/android/deep_linking/links/w;", "getOnDeepLinkClickListener", "()Lcom/avito/android/deep_linking/links/w;", "setOnDeepLinkClickListener", "(Lcom/avito/android/deep_linking/links/w;)V", "getOnDeepLinkClickListener$annotations", "Lcom/avito/android/deep_linking/links/x;", "onUrlClickListener", "Lcom/avito/android/deep_linking/links/x;", "getOnUrlClickListener", "()Lcom/avito/android/deep_linking/links/x;", "setOnUrlClickListener", "(Lcom/avito/android/deep_linking/links/x;)V", "getOnUrlClickListener$annotations", "", "getClickListeners", "()Ljava/util/Map;", "getClickListeners$annotations", "clickListeners", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AttributedText implements Parcelable {

    @k
    public static final Parcelable.Creator<AttributedText> CREATOR = new Creator();

    @k
    private final Map<String, OnClickListener> _clickListeners;

    @k
    private final List<Attribute> attributes;

    @l
    private w onDeepLinkClickListener;

    @l
    private x onUrlClickListener;

    @k
    private final String text;
    private final int version;

    /* compiled from: AttributedText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AttributedText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AttributedText createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AttributedText.class, parcel, arrayList, iL2, 1);
            }
            return new AttributedText(string, arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AttributedText[] newArray(int i12) {
            return new AttributedText[i12];
        }
    }

    /* compiled from: AttributedText.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.remote.model.text.AttributedText$linkClicks$1", f = "AttributedText.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.remote.model.text.AttributedText$linkClicks$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<I0<? super DeepLink>, Continuation<? super G0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: AttributedText.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.remote.model.text.AttributedText$linkClicks$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C76111 extends N implements Y41.a<G0> {
            final /* synthetic */ w $listener;
            final /* synthetic */ AttributedText this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C76111(AttributedText attributedText, w wVar) {
                super(0);
                this.this$0 = attributedText;
                this.$listener = wVar;
            }

            @Override // Y41.a
            public /* bridge */ /* synthetic */ G0 invoke() {
                invoke2();
                return G0.f406611a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (L.f(this.this$0.getOnDeepLinkClickListener(), this.$listener)) {
                    this.this$0.setOnDeepLinkClickListener(null);
                }
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = AttributedText.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.L$0;
                b bVar = new b(i02, 0);
                AttributedText.this.setOnDeepLinkClickListener(bVar);
                C76111 c76111 = new C76111(AttributedText.this, bVar);
                this.label = 1;
                if (F0.a(i02, c76111, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k I0<? super DeepLink> i02, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttributedText(@k String str, @k List<? extends Attribute> list, int i12) {
        this.text = str;
        this.attributes = list;
        this.version = i12;
        this._clickListeners = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttributedText copy$default(AttributedText attributedText, String str, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = attributedText.text;
        }
        if ((i13 & 2) != 0) {
            list = attributedText.attributes;
        }
        if ((i13 & 4) != 0) {
            i12 = attributedText.version;
        }
        return attributedText.copy(str, list, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void linkClicksV3$lambda$2(AttributedText attributedText, B b12) {
        b bVar = new b(b12, 1);
        b12.f(new com.avito.android.app.work.a(4, attributedText, bVar));
        attributedText.onDeepLinkClickListener = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void linkClicksV3$lambda$2$lambda$1(AttributedText attributedText, w wVar) {
        if (L.f(attributedText.onDeepLinkClickListener, wVar)) {
            attributedText.onDeepLinkClickListener = null;
        }
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    public final List<Attribute> component2() {
        return this.attributes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @k
    public final AttributedText copy(@k String text, @k List<? extends Attribute> attributes, int version) {
        return new AttributedText(text, attributes, version);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributedText)) {
            return false;
        }
        AttributedText attributedText = (AttributedText) other;
        return L.f(this.text, attributedText.text) && L.f(this.attributes, attributedText.attributes) && this.version == attributedText.version;
    }

    @k
    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    @k
    public final Map<String, OnClickListener> getClickListeners() {
        return this._clickListeners;
    }

    @l
    public final w getOnDeepLinkClickListener() {
        return this.onDeepLinkClickListener;
    }

    @l
    public final x getOnUrlClickListener() {
        return this.onUrlClickListener;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version) + H.e(this.text.hashCode() * 31, 31, this.attributes);
    }

    @k
    public final InterfaceC43160i<DeepLink> linkClicks() {
        return C43175k.d(new AnonymousClass1(null));
    }

    @k
    public final z<DeepLink> linkClicksV3() {
        return new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.remote.model.text.a
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                AttributedText.linkClicksV3$lambda$2(this.f253942b, b12);
            }
        });
    }

    public final void setOnClickListener(@k String name, @k OnClickListener listener) {
        this._clickListeners.put(name, listener);
    }

    public final void setOnDeepLinkClickListener(@l w wVar) {
        this.onDeepLinkClickListener = wVar;
    }

    public final void setOnUrlClickListener(@l x xVar) {
        this.onUrlClickListener = xVar;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AttributedText(text=");
        sb2.append(this.text);
        sb2.append(", attributes=");
        sb2.append(this.attributes);
        sb2.append(", version=");
        return r.t(sb2, this.version, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        Iterator itJ = C0.j(this.attributes, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeInt(this.version);
    }

    public /* synthetic */ AttributedText(String str, List list, int i12, int i13, C42822w c42822w) {
        this(str, list, (i13 & 4) != 0 ? 0 : i12);
    }

    public static /* synthetic */ void getClickListeners$annotations() {
    }

    public static /* synthetic */ void getOnDeepLinkClickListener$annotations() {
    }

    public static /* synthetic */ void getOnUrlClickListener$annotations() {
    }

    private static /* synthetic */ void get_clickListeners$annotations() {
    }
}
