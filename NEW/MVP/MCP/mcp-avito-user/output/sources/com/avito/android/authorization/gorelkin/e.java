package com.avito.android.authorization.gorelkin;

import androidx.core.os.C22777e;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.authorization.gorelkin.m;
import com.avito.android.remote.model.Profile;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ParsingPermissionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/authorization/gorelkin/m$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<m.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParsingPermissionFragment f93919l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ParsingPermissionFragment parsingPermissionFragment) {
        super(1);
        this.f93919l = parsingPermissionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(m.a aVar) {
        m.a aVar2 = aVar;
        if (aVar2 instanceof m.a.C2781a) {
            m.a.C2781a c2781a = (m.a.C2781a) aVar2;
            Profile profile = c2781a.f93931a;
            ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
            ParsingPermissionFragment parsingPermissionFragment = this.f93919l;
            androidx.core.content.j jVarRequireActivity = parsingPermissionFragment.requireActivity();
            if (jVarRequireActivity instanceof l) {
                ((l) jVarRequireActivity).a();
            } else {
                ParsingPermissionFragment.f93867D0.getClass();
                parsingPermissionFragment.getParentFragmentManager().o0(C22777e.b(new Q("fragment_result_profile", profile), new Q("fragment_result_session", c2781a.f93932b)), "fragment_result_key");
                parsingPermissionFragment.requireActivity().getSupportFragmentManager().Y();
            }
        }
        return G0.f406611a;
    }
}
