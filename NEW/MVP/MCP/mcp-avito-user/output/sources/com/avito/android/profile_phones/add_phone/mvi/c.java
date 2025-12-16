package com.avito.android.profile_phones.add_phone.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AddPhoneActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_phones.add_phone.mvi.AddPhoneActor", f = "AddPhoneActor.kt", i = {0, 0}, l = {137, 140}, m = "requestCode", n = {"this", "phone"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e f226885q;

    /* renamed from: r, reason: collision with root package name */
    public String f226886r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f226887s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f226888t;

    /* renamed from: u, reason: collision with root package name */
    public int f226889u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f226888t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f226887s = obj;
        this.f226889u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f226888t.d(null, this, false);
    }
}
