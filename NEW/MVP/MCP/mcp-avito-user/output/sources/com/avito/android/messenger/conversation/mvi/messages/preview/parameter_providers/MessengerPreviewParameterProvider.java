package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers;

import B0.h;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.utils.m;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import kotlin.sequences.o0;
import kotlin.text.C43066x;

/* compiled from: MessengerPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "LB0/h;", "Lcom/avito/android/messenger/conversation/T1;", "PreviewConfig", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MessengerPreviewParameterProvider implements h<T1> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PreviewConfig f193053a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessengerPreviewParameterProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider$PreviewConfig;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PreviewConfig {

        /* renamed from: b, reason: collision with root package name */
        public static final PreviewConfig f193054b;

        /* renamed from: c, reason: collision with root package name */
        public static final PreviewConfig f193055c;

        /* renamed from: d, reason: collision with root package name */
        public static final PreviewConfig f193056d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ PreviewConfig[] f193057e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f193058f;

        static {
            PreviewConfig previewConfig = new PreviewConfig("BENCHMARK", 0);
            f193054b = previewConfig;
            PreviewConfig previewConfig2 = new PreviewConfig("ALL", 1);
            f193055c = previewConfig2;
            PreviewConfig previewConfig3 = new PreviewConfig("ALL_WITH_DIFFERENT_GROUP_FLAGS", 2);
            f193056d = previewConfig3;
            PreviewConfig[] previewConfigArr = {previewConfig, previewConfig2, previewConfig3};
            f193057e = previewConfigArr;
            f193058f = kotlin.enums.c.a(previewConfigArr);
        }

        public PreviewConfig() {
            throw null;
        }

        public static PreviewConfig valueOf(String str) {
            return (PreviewConfig) Enum.valueOf(PreviewConfig.class, str);
        }

        public static PreviewConfig[] values() {
            return (PreviewConfig[]) f193057e.clone();
        }
    }

    /* compiled from: MessengerPreviewParameterProvider.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final T1 f193059a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f193060b;

        public a(@k T1 t12, boolean z12) {
            this.f193059a = t12;
            this.f193060b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f193059a, aVar.f193059a) && this.f193060b == aVar.f193060b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f193060b) + (this.f193059a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PreviewItem(value=");
            sb2.append(this.f193059a);
            sb2.append(", includeInBenchmark=");
            return r.x(sb2, this.f193060b, ')');
        }
    }

    /* compiled from: MessengerPreviewParameterProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PreviewConfig.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PreviewConfig previewConfig = PreviewConfig.f193054b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PreviewConfig previewConfig2 = PreviewConfig.f193054b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MessengerPreviewParameterProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider$a;", "<name for destructuring parameter 0>", "Lcom/avito/android/messenger/conversation/T1;", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider$a;)Lcom/avito/android/messenger/conversation/T1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<a, T1> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f193061l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final T1 invoke(a aVar) {
            a aVar2 = aVar;
            if (aVar2.f193060b) {
                return aVar2.f193059a;
            }
            return null;
        }
    }

    /* compiled from: MessengerPreviewParameterProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider$a;", "it", "Lcom/avito/android/messenger/conversation/T1;", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider$a;)Lcom/avito/android/messenger/conversation/T1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<a, T1> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f193062l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final T1 invoke(a aVar) {
            return aVar.f193059a;
        }
    }

    /* compiled from: MessengerPreviewParameterProvider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider$a;", "<name for destructuring parameter 0>", "", "Lcom/avito/android/messenger/conversation/T1$d;", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider$a;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<a, List<? extends T1.d>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f193063l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final List<? extends T1.d> invoke(a aVar) {
            T1 t12 = aVar.f193059a;
            if (!(t12 instanceof T1.d)) {
                return C42784z0.f406748b;
            }
            ArrayList arrayList = new ArrayList();
            T1.d dVar = (T1.d) t12;
            String str = dVar.f189190y;
            if (str != null && !C43066x.K(str)) {
                arrayList.add(m.b(m.f193603a, new T1.d.b.a(new MessageBody.SystemMessageBody.Text(String.valueOf(dVar.f189190y))), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821));
            }
            arrayList.add(t12);
            arrayList.add(T1.d.a(dVar, null, null, false, null, new T1.c(true, false, false, false, false, false, false, false, false, 510, null), null, null, null, null, null, null, null, null, null, null, null, null, -4097, 7));
            arrayList.add(T1.d.a(dVar, null, null, false, null, new T1.c(false, false, false, false, false, false, false, false, false, 511, null), null, null, null, null, null, null, null, null, null, null, null, null, -4097, 7));
            arrayList.add(T1.d.a(dVar, null, null, false, null, new T1.c(false, true, false, false, false, false, false, false, false, 509, null), null, null, null, null, null, null, null, null, null, null, null, null, -4097, 7));
            return arrayList;
        }
    }

    public MessengerPreviewParameterProvider(@k PreviewConfig previewConfig) {
        this.f193053a = previewConfig;
    }

    @k
    public static a c(@k T1.d dVar, boolean z12) {
        return new a(dVar, z12);
    }

    @Override // B0.h
    @k
    public final InterfaceC43030m<T1> a() {
        InterfaceC43030m<a> interfaceC43030mB = b();
        int iOrdinal = this.f193053a.ordinal();
        if (iOrdinal == 0) {
            return C43033p.y(interfaceC43030mB, c.f193061l);
        }
        if (iOrdinal == 1) {
            return new o0(interfaceC43030mB, d.f193062l);
        }
        if (iOrdinal == 2) {
            return C43033p.p(interfaceC43030mB, e.f193063l);
        }
        throw new NoWhenBranchMatchedException();
    }

    @k
    public abstract InterfaceC43030m<a> b();
}
