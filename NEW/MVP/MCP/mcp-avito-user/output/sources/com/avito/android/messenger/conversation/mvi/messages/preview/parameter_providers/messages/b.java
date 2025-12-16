package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;
import kotlin.text.C43066x;

/* compiled from: CaptionedMessagesPreviewParameterProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/b;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends MessengerPreviewParameterProvider {

    /* compiled from: CaptionedMessagesPreviewParameterProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/b$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f193069a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f193070b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f193071c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k f193072d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f193073e;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, boolean z12) {
            this.f193069a = str;
            this.f193070b = str2;
            this.f193071c = str3;
            this.f193072d = kVar;
            this.f193073e = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f193069a, aVar.f193069a) && L.f(this.f193070b, aVar.f193070b) && L.f(this.f193071c, aVar.f193071c) && L.f(this.f193072d, aVar.f193072d) && this.f193073e == aVar.f193073e;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f193069a.hashCode() * 31, 31, this.f193070b), 31, this.f193071c);
            com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar = this.f193072d;
            return Boolean.hashCode(this.f193073e) + ((iD2 + (kVar == null ? 0 : kVar.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MessageData(message=");
            sb2.append(this.f193069a);
            sb2.append(", name=");
            sb2.append(this.f193070b);
            sb2.append(", label=");
            sb2.append(this.f193071c);
            sb2.append(", icon=");
            sb2.append(this.f193072d);
            sb2.append(", includeInBenchmark=");
            return r.x(sb2, this.f193073e, ')');
        }
    }

    /* compiled from: CaptionedMessagesPreviewParameterProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C5708b {
        static {
            int[] iArr = new int[MessengerPreviewParameterProvider.PreviewConfig.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MessengerPreviewParameterProvider.PreviewConfig previewConfig = MessengerPreviewParameterProvider.PreviewConfig.f193054b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MessengerPreviewParameterProvider.PreviewConfig previewConfig2 = MessengerPreviewParameterProvider.PreviewConfig.f193054b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        String str;
        List listU = C42745f0.U(new a("Short", "Name", "Label", null, false), new a("Short", "", "Label", null, false), new a("very loooooooooooooooong meeeeeeeeeeeeeeeessage", "Name", "Label", null, false), new a("Short", "Loooooooooooooooooong Naaaaaaaaaaaaameeeeeeeeeeeee Naaaaaaaaaaaaameeeeeeeeeeeee", "Label", null, true), new a("very loooooooooooooooong meeeeeeeeeeeeeeeessage", "Loooooooooooooooooong Naaaaaaaaaaaaameeeeeeeeeeeee Naaaaaaaaaaaaameeeeeeeeeeeee", "Label", null, false), new a("Short", "Name", "Laaaaaaaaaaaaabeeeeeeeeeeeel veeeeeeeeeeeryyyyyyyyy Laaaaaaaaaaaaabeeeeeeeeeeeel", null, false), new a("very loooooooooooooooong meeeeeeeeeeeeeeeessage", "Name", "Laaaaaaaaaaaaabeeeeeeeeeeeel veeeeeeeeeeeryyyyyyyyy Laaaaaaaaaaaaabeeeeeeeeeeeel", null, false), new a("very loooooooooooooooong meeeeeeeeeeeeeeeessage", "", "Laaaaaaaaaaaaabeeeeeeeeeeeel veeeeeeeeeeeryyyyyyyyy Laaaaaaaaaaaaabeeeeeeeeeeeel", null, false), new a("very loooooooooooooooong meeeeeeeeeeeeeeeessage", "Loooooooooooooooooong Naaaaaaaaaaaaameeeeeeeeeeeee Naaaaaaaaaaaaameeeeeeeeeeeee", "", null, false));
        List<a> list = listU;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (a aVar : list) {
            com.akita.compose.theme.re23.e eVar = com.akita.compose.theme.re23.e.f64437a;
            arrayList.add(new a(aVar.f193069a, aVar.f193070b, aVar.f193071c, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.f.a(), aVar.f193073e));
        }
        ArrayList arrayListH0 = C42745f0.h0(arrayList, listU);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListH0, 10));
        Iterator it = arrayListH0.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            a aVar2 = (a) it.next();
            com.avito.android.messenger.conversation.mvi.messages.utils.m mVar = com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a;
            arrayList2.add(new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.d(mVar, com.avito.android.messenger.conversation.mvi.messages.utils.m.h(mVar, aVar2.f193069a, null, true, 6), null, aVar2.f193070b, aVar2.f193071c, aVar2.f193072d, new T1.c(true, true, false, false, false, false, false, false, true, 252, null), 6), aVar2.f193073e));
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            T1.d dVar = (T1.d) ((MessengerPreviewParameterProvider.a) it2.next()).f193059a;
            String str2 = dVar.f189190y;
            arrayList3.add(new MessengerPreviewParameterProvider.a(T1.d.a(dVar, null, null, true, null, null, null, str2 != null ? C43066x.a0(C43066x.a0(str2, "Входящее", "Исходяшее", false), "Incoming", "Outgoing", false) : str, null, null, null, null, null, null, null, null, null, null, -8388641, 7), false));
            str = null;
        }
        return new C42770s0(C42745f0.h0(arrayList3, arrayList2));
    }

    public /* synthetic */ b(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193055c : previewConfig);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(@Y61.k MessengerPreviewParameterProvider.PreviewConfig previewConfig) {
        MessengerPreviewParameterProvider.PreviewConfig previewConfig2;
        int iOrdinal = previewConfig.ordinal();
        if (iOrdinal == 0) {
            previewConfig2 = MessengerPreviewParameterProvider.PreviewConfig.f193054b;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            previewConfig2 = MessengerPreviewParameterProvider.PreviewConfig.f193055c;
        }
        super(previewConfig2);
    }
}
