package com.avito.android.code_check_public;

import Y41.l;
import androidx.compose.foundation.H;
import com.avito.android.code_check_public.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: Navigation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/i;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c<UserDialog> f119292a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC43160i<? extends DeepLink>, InterfaceC43160i<com.avito.android.code_check_public.a>> f119293b;

    /* compiled from: Navigation.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/deep_linking/links/DeepLink;", MessageBody.SystemMessageBody.Platform.FLOW, "Lcom/avito/android/code_check_public/a$a$b;", "invoke", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<InterfaceC43160i<? extends DeepLink>, InterfaceC43160i<? extends a.InterfaceC3494a.b>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f119294l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43160i<? extends a.InterfaceC3494a.b> invoke(InterfaceC43160i<? extends DeepLink> interfaceC43160i) {
            return new h(interfaceC43160i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@Y61.k c<UserDialog> cVar, @Y61.k l<? super InterfaceC43160i<? extends DeepLink>, ? extends InterfaceC43160i<? extends com.avito.android.code_check_public.a>> lVar) {
        this.f119292a = cVar;
        this.f119293b = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f119292a, iVar.f119292a) && L.f(this.f119293b, iVar.f119293b);
    }

    public final int hashCode() {
        return this.f119293b.hashCode() + (this.f119292a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserDialogWithMapper(userDialog=");
        sb2.append(this.f119292a);
        sb2.append(", mapper=");
        return H.l(sb2, this.f119293b, ')');
    }

    public /* synthetic */ i(c cVar, l lVar, int i12, C42822w c42822w) {
        this(cVar, (i12 & 2) != 0 ? a.f119294l : lVar);
    }
}
