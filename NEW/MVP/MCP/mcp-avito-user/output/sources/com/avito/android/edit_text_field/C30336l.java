package com.avito.android.edit_text_field;

import Ay.InterfaceC13104b;
import Ay.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EditTextFieldInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/l;", "Lcom/avito/android/edit_text_field/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.edit_text_field.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30336l implements InterfaceC30331g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final EditTextFieldFragment.Mode f146999a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f147000b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f147001c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f147002d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f147003e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f147004f;

    @Inject
    public C30336l(@Y61.k EditTextFieldFragment.Mode mode, @Y61.k h31.e<D0> eVar, @Y61.k h31.e<Gson> eVar2, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k R0 r02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f146999a = mode;
        this.f147000b = eVar;
        this.f147001c = eVar2;
        this.f147002d = interfaceC35863o4;
        this.f147003e = r02;
        this.f147004f = aVar;
    }

    @Override // com.avito.android.edit_text_field.InterfaceC30331g
    @Y61.k
    public final InterfaceC43160i<InterfaceC13104b> a(@Y61.k String str, @Y61.l d.c cVar) {
        EditTextFieldFragment.Mode mode = this.f146999a;
        boolean z12 = mode instanceof EditTextFieldFragment.Mode.Extended;
        R0 r02 = this.f147003e;
        if (z12) {
            return C43175k.I(r02.a(), new C43152f0(C43175k.G(new C30334j(cVar, str, this, (EditTextFieldFragment.Mode.Extended) mode, null)), new C30335k(str, null)));
        }
        if (!(mode instanceof EditTextFieldFragment.Mode.Basic)) {
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.I(r02.a(), new C43152f0(C43175k.G(new C30332h(this, ((EditTextFieldFragment.Mode.Basic) mode).f146893b, str, null)), new C30333i(str, null)));
    }
}
