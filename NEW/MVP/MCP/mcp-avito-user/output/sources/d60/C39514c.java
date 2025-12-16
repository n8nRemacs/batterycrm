package d60;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.PassportMergeAccountsLink;
import com.avito.android.lib.beduin_v2.feature.launchclient.g;
import com.avito.android.printable_text.PrintableText;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import j31.InterfaceC42189a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportMergeAccountsLinkResultConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld60/c;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* renamed from: d60.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39514c implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f393665a;

    @Inject
    public C39514c(@k Context context) {
        this.f393665a = context;
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (bVar instanceof PassportMergeAccountsLink.b.C4011b) {
            PrintableText printableText = ((PassportMergeAccountsLink.b.C4011b) bVar).f133540b;
            String strK0 = printableText != null ? printableText.k0(this.f393665a) : null;
            if (strK0 == null) {
                strK0 = "";
            }
            Map mapSingletonMap = Collections.singletonMap("completionMessage", strK0);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapSingletonMap.entrySet()) {
                arrayList.add(new com.avito.beduin.v2.interaction.launch.flow.k((String) entry.getKey(), (String) entry.getValue()));
            }
            kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        } else {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar instanceof PassportMergeAccountsLink.b.C4011b ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
