package com.avito.android.timestamp_storage.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import vE0.AbstractC49202b;

/* compiled from: TimestampStorageImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.timestamp_storage.domain.TimestampStorageImpl", f = "TimestampStorageImpl.kt", i = {0, 0}, l = {96}, m = "isActive", n = {"this", Navigation.CONFIG}, s = {"L$0", "L$2"})
/* loaded from: classes4.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public j f301490q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f301491r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC49202b f301492s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f301493t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f301494u;

    /* renamed from: v, reason: collision with root package name */
    public int f301495v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f301494u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f301493t = obj;
        this.f301495v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f301494u.c(null, this);
    }
}
