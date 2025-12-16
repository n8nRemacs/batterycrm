package ru.cyberity.cbr.presentation.screen.questionnary.model;

import Y61.k;
import Y61.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.data.source.applicant.remote.r;
import ru.cyberity.cbr.core.data.source.applicant.remote.s;
import ru.cyberity.cbr.core.data.source.applicant.remote.u;

/* compiled from: QuestionnaireSubmitModelExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\u001a0\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0000\u001a\"\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "", "sectionId", "itemId", "valueToUpdate", "a", "", "valuesToUpdate", "b", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f {
    @k
    public static final r a(@k r rVar, @l String str, @l String str2, @l String str3) {
        u uVar;
        a(rVar, str);
        if (str == null || str2 == null || (uVar = rVar.e().get(str)) == null) {
            return rVar;
        }
        if (str3 == null) {
            uVar.b().remove(str2);
            return rVar;
        }
        uVar.b().put(str2, new s(str3, (List) null, 2, (C42822w) null));
        return rVar;
    }

    @l
    public static final List<String> b(@k r rVar, @l String str, @l String str2) {
        u uVar;
        s sVar;
        if (str2 == null || str == null || (uVar = rVar.e().get(str)) == null || (sVar = uVar.b().get(str2)) == null) {
            return null;
        }
        return sVar.e();
    }

    @k
    public static final r a(@k r rVar, @l String str, @l String str2, @l List<String> list) {
        u uVar;
        a(rVar, str);
        if (str == null || str2 == null || (uVar = rVar.e().get(str)) == null) {
            return rVar;
        }
        if (list != null && !list.isEmpty()) {
            uVar.b().put(str2, new s((String) null, list, 1, (C42822w) null));
            return rVar;
        }
        uVar.b().remove(str2);
        return rVar;
    }

    @l
    public static final String a(@k r rVar, @l String str, @l String str2) {
        u uVar;
        s sVar;
        if (str2 == null || str == null || (uVar = rVar.e().get(str)) == null || (sVar = uVar.b().get(str2)) == null) {
            return null;
        }
        return sVar.getValue();
    }

    @k
    public static final r a(@k r rVar, @l String str) {
        if (str != null && rVar.e().get(str) == null) {
            rVar.e().put(str, new u((Map) null, 1, (C42822w) null));
        }
        return rVar;
    }
}
