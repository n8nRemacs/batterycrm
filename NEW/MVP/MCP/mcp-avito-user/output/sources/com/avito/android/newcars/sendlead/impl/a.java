package com.avito.android.newcars.sendlead.impl;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import k30.InterfaceC42490a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.C42822w;
import l30.InterfaceC43533a;

/* compiled from: NewCarsSendLeadUseCaseImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars/sendlead/impl/a;", "Lk30/a;", "a", "_avito_new-cars-send-lead_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements InterfaceC42490a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43533a f207253a;

    /* compiled from: NewCarsSendLeadUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/newcars/sendlead/impl/a$a;", "", "<init>", "()V", "", "SOURCE", "Ljava/lang/String;", "_avito_new-cars-send-lead_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.newcars.sendlead.impl.a$a, reason: collision with other inner class name */
    public static final class C6180a {
        public /* synthetic */ C6180a(C42822w c42822w) {
            this();
        }

        public C6180a() {
        }
    }

    static {
        new C6180a(null);
    }

    @Inject
    public a(@k InterfaceC43533a interfaceC43533a) {
        this.f207253a = interfaceC43533a;
    }

    @Override // k30.InterfaceC42490a
    @l
    public final Object a(long j12, @l String str, @k String str2, @k Continuation<? super TypedResult<Object>> continuation) {
        return this.f207253a.a(Boxing.boxLong(j12), str, str2, "superform_item", continuation);
    }
}
