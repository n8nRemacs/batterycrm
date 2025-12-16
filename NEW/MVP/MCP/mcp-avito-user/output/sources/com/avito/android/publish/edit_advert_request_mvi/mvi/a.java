package com.avito.android.publish.edit_advert_request_mvi.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditRequestActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.mvi.EditRequestActor", f = "EditRequestActor.kt", i = {0, 0}, l = {72, 73}, m = "finishEditing", n = {"message", "collector"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f235608q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f235609r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f235610s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f235611t;

    /* renamed from: u, reason: collision with root package name */
    public int f235612u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f235611t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f235610s = obj;
        this.f235612u |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.c(this.f235611t, null, null, this);
    }
}
