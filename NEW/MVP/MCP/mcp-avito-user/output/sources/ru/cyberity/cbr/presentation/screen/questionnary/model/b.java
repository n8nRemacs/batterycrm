package ru.cyberity.cbr.presentation.screen.questionnary.model;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.data.source.applicant.remote.t;
import ru.cyberity.cbr.core.data.source.applicant.remote.v;
import ru.cyberity.cbr.core.presentation.form.model.CountriesData;
import ru.cyberity.cbr.domain.g;
import ru.cyberity.cbr.domain.i;
import ru.cyberity.cbr.domain.m;

/* compiled from: CBRQuestionnaireViewModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/b;", "Landroidx/lifecycle/a;", "Landroidx/savedstate/e;", SearchParamsConverterKt.OWNER, "Lru/cyberity/cbr/core/b;", "serviceLocator", "Landroid/os/Bundle;", "args", "<init>", "(Landroidx/savedstate/e;Lru/cyberity/cbr/core/b;Landroid/os/Bundle;)V", "Landroidx/lifecycle/M0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/r0;", VoiceInfo.STATE, "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/r0;)Landroidx/lifecycle/M0;", "a", "Lru/cyberity/cbr/core/b;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends AbstractC22993a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.b serviceLocator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Bundle args;

    public /* synthetic */ b(InterfaceC23487e interfaceC23487e, ru.cyberity.cbr.core.b bVar, Bundle bundle, int i12, C42822w c42822w) {
        this(interfaceC23487e, bVar, (i12 & 4) != 0 ? null : bundle);
    }

    @Override // androidx.view.AbstractC22993a
    @k
    public <T extends M0> T create(@k String key, @k Class<T> modelClass, @k C23060r0 state) {
        g gVar = new g(this.serviceLocator);
        i iVar = new i(this.serviceLocator.e());
        ru.cyberity.cbr.core.data.source.common.a aVarK = this.serviceLocator.k();
        ru.cyberity.cbr.core.data.source.dynamic.c cVarM = this.serviceLocator.m();
        ru.cyberity.cbr.core.domain.b bVar = new ru.cyberity.cbr.core.domain.b(this.serviceLocator.k(), this.serviceLocator.m());
        m mVar = new m(this.serviceLocator);
        ru.cyberity.cbr.domain.d dVar = new ru.cyberity.cbr.domain.d(this.serviceLocator.m(), this.serviceLocator.k(), this.serviceLocator.e());
        Bundle bundle = this.args;
        t tVar = bundle != null ? (t) bundle.getParcelable("QUESTIONNAIRE") : null;
        Bundle bundle2 = this.args;
        v vVar = bundle2 != null ? (v) bundle2.getParcelable("QUESTIONNAIRE_SUMMARY") : null;
        Bundle bundle3 = this.args;
        return new a(state, gVar, iVar, mVar, dVar, aVarK, cVarM, bVar, tVar, vVar, bundle3 != null ? (CountriesData) bundle3.getParcelable("COUNTRIES_DATA") : null);
    }

    public b(@k InterfaceC23487e interfaceC23487e, @k ru.cyberity.cbr.core.b bVar, @l Bundle bundle) {
        super(interfaceC23487e, bundle);
        this.serviceLocator = bVar;
        this.args = bundle;
    }
}
