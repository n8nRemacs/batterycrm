package com.avito.android.gsm_call_starter.impl_module.intent_factory;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.util.InterfaceC35877q4;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: DialIntentFactoryImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gsm_call_starter/impl_module/intent_factory/b;", "Lcom/avito/android/gsm_call_starter/impl_module/intent_factory/a;", "a", "_avito_gsm-call-starter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.gsm_call_starter.impl_module.intent_factory.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f161211a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f161212b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p<? super String, ? super String, ? extends Intent> f161213c = c.f161216l;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<? super Intent, Boolean> f161214d = new C4717b();

    /* compiled from: DialIntentFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/gsm_call_starter/impl_module/intent_factory/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_gsm-call-starter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DialIntentFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "intent", "Landroid/content/Intent;", "invoke", "(Landroid/content/Intent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.gsm_call_starter.impl_module.intent_factory.b$b, reason: collision with other inner class name */
    public static final class C4717b extends N implements l<Intent, Boolean> {
        public C4717b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Intent intent) {
            return Boolean.valueOf(!b.this.f161212b.getPackageManager().queryIntentActivities(intent, 131072).isEmpty());
        }
    }

    /* compiled from: DialIntentFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "action", "", "formattedPhone", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<String, String, Intent> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f161216l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final Intent invoke(String str, String str2) {
            V2.f318762a.c("DialIntentFactory", "create intent with Intent.ACTION_DIAL", null);
            return new Intent(str, Uri.fromParts("tel", Uri.decode(str2), null));
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@InterfaceC35877q4 @k InterfaceC35945t1<String> interfaceC35945t1, @k Context context) {
        this.f161211a = interfaceC35945t1;
        this.f161212b = context;
    }

    @Override // com.avito.android.gsm_call_starter.impl_module.intent_factory.a
    @k
    public final Intent a(@k String str) {
        return (Intent) ((c) this.f161213c).invoke("android.intent.action.CALL", this.f161211a.a(str));
    }

    @Override // com.avito.android.gsm_call_starter.impl_module.intent_factory.a
    public final boolean b(@k Intent intent) {
        return ((Boolean) ((C4717b) this.f161214d).invoke(intent)).booleanValue();
    }

    @Override // com.avito.android.gsm_call_starter.impl_module.intent_factory.a
    @k
    public final Intent c(@k String str) {
        return (Intent) ((c) this.f161213c).invoke("android.intent.action.DIAL", this.f161211a.a(str));
    }
}
