package com.avito.android.auto_contacts.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AutoContactsPackagesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.auto_contacts.domain.AutoContactsPackagesInteractor", f = "AutoContactsPackagesInteractor.kt", i = {}, l = {15}, m = "getContactsPackages", n = {}, s = {})
/* loaded from: classes11.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f94869q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f94870r;

    /* renamed from: s, reason: collision with root package name */
    public int f94871s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f94870r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f94869q = obj;
        this.f94871s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f94870r.a(this);
    }
}
