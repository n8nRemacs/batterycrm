package ru.cyberity.cbr.prooface.presentation;

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
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.OkHttpClient;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.r;
import ru.cyberity.cbr.prooface.network.Liveness3dFaceRepository;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/prooface/presentation/ar2zdFahlgqFwCDaNcK2mMj8NV2W;", "Landroidx/lifecycle/a;", "Landroidx/savedstate/e;", SearchParamsConverterKt.OWNER, "Lru/cyberity/cbr/core/b;", "serviceLocator", "Landroid/os/Bundle;", "args", "<init>", "(Landroidx/savedstate/e;Lru/cyberity/cbr/core/b;Landroid/os/Bundle;)V", "Landroidx/lifecycle/M0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/r0;", VoiceInfo.STATE, "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/r0;)Landroidx/lifecycle/M0;", "AnZ4ntgRZiVOQFYAd", "Lru/cyberity/cbr/core/b;", "uz93gWN1OYgIQ", "Landroid/os/Bundle;", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class ar2zdFahlgqFwCDaNcK2mMj8NV2W extends AbstractC22993a {

    /* renamed from: AnZ4ntgRZiVOQFYAd, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.b serviceLocator;

    /* renamed from: uz93gWN1OYgIQ, reason: from kotlin metadata */
    @l
    private final Bundle args;

    public ar2zdFahlgqFwCDaNcK2mMj8NV2W(@k InterfaceC23487e interfaceC23487e, @k ru.cyberity.cbr.core.b bVar, @l Bundle bundle) {
        super(interfaceC23487e, bundle);
        this.serviceLocator = bVar;
        this.args = bundle;
    }

    @Override // androidx.view.AbstractC22993a
    @k
    public <T extends M0> T create(@k String key, @k Class<T> modelClass, @k C23060r0 state) {
        String value;
        DocumentType type;
        ru.cyberity.cbr.core.domain.a aVarO = this.serviceLocator.o();
        Bundle bundle = this.args;
        Document document = bundle != null ? (Document) bundle.getParcelable("EXTRA_DOCUMENT") : null;
        Document document2 = document != null ? document : null;
        if (document2 == null || (type = document2.getType()) == null || (value = type.getValue()) == null) {
            value = "TYPE_UNKNOWN";
        }
        String str = value;
        AbstractC43443a json = this.serviceLocator.getJson();
        ru.cyberity.cbr.prooface.network.ar2zdFahlgqFwCDaNcK2mMj8NV2W ar2zdfahlgqfwcdanck2mmj8nv2w = new ru.cyberity.cbr.prooface.network.ar2zdFahlgqFwCDaNcK2mMj8NV2W();
        OkHttpClient okHttpClientT = this.serviceLocator.t();
        String value2 = (String) state.b("EXTRA_ID_DOC_SET_TYPE");
        if (value2 == null) {
            value2 = r.g.f433189e.getValue();
        }
        return new VEkdd97RzWe(aVarO, str, json, ar2zdfahlgqfwcdanck2mmj8nv2w, new Liveness3dFaceRepository(okHttpClientT, value2, this.serviceLocator.getSession(), this.serviceLocator.getJson(), this.serviceLocator.A()), this.serviceLocator.z(), this.serviceLocator.k(), this.serviceLocator.m(), this.serviceLocator.p());
    }
}
