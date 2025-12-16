package com.avito.android.profile_settings_extended.phones;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.profile_settings_extended.adapter.phones.ExtendedSettingsPhonesItem;
import com.avito.android.profile_settings_extended.adapter.phones.PhoneValue;
import com.avito.android.profile_settings_extended.adapter.phones.PhoneVerificationStatusPending;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import com.avito.android.util.R0;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zb0.C50541a;

/* compiled from: ExtendedProfileSettingsPhonesInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/phones/b;", "Lcom/avito/android/profile_settings_extended/phones/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.profile_settings_extended.phones.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f230777a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.profile_settings_extended.P f230778b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C30277e1 f230779c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f230780d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f230781e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public PhoneValue f230782f;

    /* compiled from: ExtendedProfileSettingsPhonesInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.phones.ExtendedProfileSettingsPhonesInteractorImpl$attachPhone$1", f = "ExtendedProfileSettingsPhonesInteractor.kt", i = {0, 1, 2, 3, 3, 4, 5, 5}, l = {116, 119, 122, 125, 129, 139, 140}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "result", "$this$flow", "$this$flow", "error"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f230783q;

        /* renamed from: r, reason: collision with root package name */
        public int f230784r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f230785s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f230787u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f230788v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f230789w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, List<String> list, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f230787u = str;
            this.f230788v = list;
            this.f230789w = str2;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            ?? r32 = this.f230788v;
            String str = this.f230789w;
            a aVar = b.this.new a(this.f230787u, r32, str, continuation);
            aVar.f230785s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:14:0x0044, B:49:0x010b, B:50:0x0117, B:52:0x011d, B:54:0x012a, B:62:0x0138, B:64:0x013c, B:69:0x0146, B:39:0x00df, B:41:0x00e6, B:44:0x00f7, B:46:0x00fb), top: B:82:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f7 A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:14:0x0044, B:49:0x010b, B:50:0x0117, B:52:0x011d, B:54:0x012a, B:62:0x0138, B:64:0x013c, B:69:0x0146, B:39:0x00df, B:41:0x00e6, B:44:0x00f7, B:46:0x00fb), top: B:82:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x011d A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:14:0x0044, B:49:0x010b, B:50:0x0117, B:52:0x011d, B:54:0x012a, B:62:0x0138, B:64:0x013c, B:69:0x0146, B:39:0x00df, B:41:0x00e6, B:44:0x00f7, B:46:0x00fb), top: B:82:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013c A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:14:0x0044, B:49:0x010b, B:50:0x0117, B:52:0x011d, B:54:0x012a, B:62:0x0138, B:64:0x013c, B:69:0x0146, B:39:0x00df, B:41:0x00e6, B:44:0x00f7, B:46:0x00fb), top: B:82:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0158 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0184 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0137 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r4v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 412
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.phones.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSettingsPhonesInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.phones.ExtendedProfileSettingsPhonesInteractorImpl$replacePhone$1", f = "ExtendedProfileSettingsPhonesInteractor.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5}, l = {157, 161, 164, 168, 172, 182, 183}, m = "invokeSuspend", n = {"$this$flow", "phone", "$this$flow", "phone", "$this$flow", "phone", "$this$flow", "phone", "result", "$this$flow", "phone", "$this$flow", "phone", "error"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.avito.android.profile_settings_extended.phones.b$b, reason: collision with other inner class name */
    public static final class C7021b extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public PhoneValue f230790q;

        /* renamed from: r, reason: collision with root package name */
        public Object f230791r;

        /* renamed from: s, reason: collision with root package name */
        public int f230792s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f230793t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ PhoneValue f230794u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b f230795v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f230796w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f230797x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7021b(PhoneValue phoneValue, b bVar, String str, String str2, Continuation<? super C7021b> continuation) {
            super(2, continuation);
            this.f230794u = phoneValue;
            this.f230795v = bVar;
            this.f230796w = str;
            this.f230797x = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7021b c7021b = new C7021b(this.f230794u, this.f230795v, this.f230796w, this.f230797x, continuation);
            c7021b.f230793t = obj;
            return c7021b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7021b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Not initialized variable reg: 7, insn: 0x0066: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:103), block:B:24:0x0065 */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:21:0x0060, B:38:0x00ab, B:40:0x00b1, B:43:0x00c6, B:45:0x00ca, B:35:0x0095), top: B:77:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c6 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:21:0x0060, B:38:0x00ab, B:40:0x00b1, B:43:0x00c6, B:45:0x00ca, B:35:0x0095), top: B:77:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00f0 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:15:0x0048, B:49:0x00de, B:50:0x00ea, B:52:0x00f0, B:54:0x00fd, B:58:0x0105, B:60:0x0109, B:64:0x0113), top: B:80:0x0048 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0109 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:15:0x0048, B:49:0x00de, B:50:0x00ea, B:52:0x00f0, B:54:0x00fd, B:58:0x0105, B:60:0x0109, B:64:0x0113), top: B:80:0x0048 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0127 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0157 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0104 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.phones.b.C7021b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k d dVar, @k com.avito.android.profile_settings_extended.P p12, @k C30277e1 c30277e1, @N3.a @k InterfaceC35945t1<String> interfaceC35945t1, @k R0 r02) {
        this.f230777a = dVar;
        this.f230778b = p12;
        this.f230779c = c30277e1;
        this.f230780d = interfaceC35945t1;
        this.f230781e = r02;
    }

    @Override // com.avito.android.profile_settings_extended.phones.a
    @k
    public final C43210w a(@k PhoneValue phoneValue) {
        this.f230782f = phoneValue;
        return new C43210w(new ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.OpenAddPhoneForReplacementScreenEvent(phoneValue.f229694b.f229691d));
    }

    @Override // com.avito.android.profile_settings_extended.phones.a
    @k
    public final InterfaceC43160i<ExtendedProfileSettingsInternalAction> b(@k String str, @k String str2, @k List<String> list) {
        return C43175k.I(this.f230781e.a(), C43175k.G(new a(str, list, str2, null)));
    }

    @Override // com.avito.android.profile_settings_extended.phones.a
    @k
    public final InterfaceC43160i<ExtendedProfileSettingsInternalAction> c(@k String str, @k String str2, @l PhoneValue phoneValue) {
        return C43175k.I(this.f230781e.a(), C43175k.G(new C7021b(phoneValue, this, str, str2, null)));
    }

    @Override // com.avito.android.profile_settings_extended.phones.a
    @k
    public final InterfaceC43160i<ExtendedProfileSettingsInternalAction> d(@k ExtendedSettingsPhonesItem.Phone phone) {
        String str = phone.f229691d;
        if (C50541a.a(str) || !(phone.f229692e instanceof PhoneVerificationStatusPending)) {
            return C43175k.w();
        }
        com.avito.android.profile_settings_extended.P p12 = this.f230778b;
        String strD = p12.d(str);
        String strQ = p12.q();
        String strR = p12.r();
        FontAttribute fontAttribute = new FontAttribute("header1", p12.g(), Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD)));
        FontAttribute fontAttribute2 = new FontAttribute("header2", p12.j(), Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD)));
        String strE = p12.e();
        C30277e1 c30277e1 = this.f230779c;
        c30277e1.getClass();
        n<Object> nVar = C30277e1.f144946d1[0];
        return new C43210w(new ExtendedProfileSettingsInternalAction.PhonesWidgetInternalAction.OpenLandlinePhoneVerificationStatusScreen(strD, strQ, new AttributedText(strR, C42745f0.U(fontAttribute, fontAttribute2, new LinkAttribute("supportLink", strE, (String) c30277e1.f145001b.a().getValue(), null, 8, null)), 0, 4, null)));
    }
}
