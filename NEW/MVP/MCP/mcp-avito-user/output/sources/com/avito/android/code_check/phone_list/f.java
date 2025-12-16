package com.avito.android.code_check.phone_list;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PhoneListFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.code_check.phone_list.PhoneListFragment", f = "PhoneListFragment.kt", i = {}, l = {161}, m = "subscribeToSharedDataChanges", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f118975q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PhoneListFragment f118976r;

    /* renamed from: s, reason: collision with root package name */
    public int f118977s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PhoneListFragment phoneListFragment, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f118976r = phoneListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f118975q = obj;
        this.f118977s |= BeduinInputModel.MIN_TEXT_VERSION;
        return PhoneListFragment.x5(this.f118976r, this);
    }
}
