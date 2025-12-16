package com.avito.android.authorization.auto_recovery.phone_confirm;

import androidx.camera.camera2.internal.compat.workaround.v;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Y1;

/* compiled from: AutoRecoveryDialogBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/phone_confirm/l;", "Lcom/avito/android/authorization/auto_recovery/phone_confirm/i;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f93237a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f93238b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f93239c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y1<To.d> f93240d;

    /* compiled from: AutoRecoveryDialogBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/deep_linking/links/DeepLink;", MessageBody.SystemMessageBody.Platform.FLOW, "Lcom/avito/android/code_check_public/a;", "invoke", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC43160i<? extends DeepLink>, InterfaceC43160i<? extends com.avito.android.code_check_public.a>> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43160i<? extends com.avito.android.code_check_public.a> invoke(InterfaceC43160i<? extends DeepLink> interfaceC43160i) {
            return new k(interfaceC43160i, l.this);
        }
    }

    /* compiled from: AutoRecoveryDialogBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/deep_linking/links/DeepLink;", MessageBody.SystemMessageBody.Platform.FLOW, "Lcom/avito/android/code_check_public/a;", "invoke", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC43160i<? extends DeepLink>, InterfaceC43160i<? extends com.avito.android.code_check_public.a>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ EmptyDeepLink f93242l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f93243m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f93244n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f93245o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EmptyDeepLink emptyDeepLink, l lVar, String str, long j12) {
            super(1);
            this.f93242l = emptyDeepLink;
            this.f93243m = lVar;
            this.f93244n = str;
            this.f93245o = j12;
        }

        @Override // Y41.l
        public final InterfaceC43160i<? extends com.avito.android.code_check_public.a> invoke(InterfaceC43160i<? extends DeepLink> interfaceC43160i) {
            return new m(interfaceC43160i, this.f93242l, this.f93243m, this.f93244n, this.f93245o);
        }
    }

    @Inject
    public l(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.text.a aVar, @N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @com.avito.android.code_check_public.g @Y61.k Y1<To.d> y12) {
        this.f93237a = interfaceC28373a;
        this.f93238b = aVar;
        this.f93239c = interfaceC35945t1;
        this.f93240d = y12;
    }

    @Override // com.avito.android.authorization.auto_recovery.phone_confirm.i
    @Y61.k
    public final com.avito.android.code_check_public.i a(long j12, @Y61.k String str) {
        EmptyDeepLink emptyDeepLink = new EmptyDeepLink();
        return new com.avito.android.code_check_public.i(new v(this, str, emptyDeepLink, new EmptyDeepLink(), 1), new b(emptyDeepLink, this, str, j12));
    }

    @Override // com.avito.android.authorization.auto_recovery.phone_confirm.i
    @Y61.k
    public final com.avito.android.code_check_public.i b() {
        return new com.avito.android.code_check_public.i(new com.avito.android.authorization.auto_recovery.phone_confirm.b(1), new a());
    }
}
