package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageCaption.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192348l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f192349m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k f192350n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T1.c f192351o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f192352p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f192353q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, T1.c cVar, v vVar, int i12) {
        super(2);
        this.f192348l = str;
        this.f192349m = str2;
        this.f192350n = kVar;
        this.f192351o = cVar;
        this.f192352p = vVar;
        this.f192353q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192353q | 1);
        String str = this.f192349m;
        com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar = this.f192350n;
        d.a(this.f192348l, str, kVar, this.f192351o, this.f192352p, a12, iA2);
        return G0.f406611a;
    }
}
