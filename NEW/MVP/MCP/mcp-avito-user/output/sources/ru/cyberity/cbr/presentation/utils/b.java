package ru.cyberity.cbr.presentation.utils;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.u0;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.o;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: ApplicantDataFieldToFormItemExtensions.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0098\u0001\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2'\b\u0002\u0010\u0014\u001a!\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0018H\u0002¢\u0006\u0004\b\u0016\u0010\u001c\u001aS\u0010\u0016\u001a\u00020 *\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010!\u001aE\u0010\u0016\u001a\u00020 *\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010#\u001a\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010$¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "", "country", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "Lru/cyberity/cbr/domain/c;", "applicantDataResources", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "Lkotlin/Function2;", "keyResolver", "", "fieldError", "", "shouldBeRequired", "Lkotlin/Function1;", "Lru/cyberity/cbr/core/data/model/FieldName;", "Lkotlin/S;", "name", "fieldName", "valueCache", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "a", "(Lru/cyberity/cbr/core/data/model/h$d;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/e;Lru/cyberity/cbr/domain/c;Lru/cyberity/cbr/core/data/source/dynamic/c$c;LY41/p;Ljava/lang/CharSequence;Ljava/lang/Boolean;LY41/l;)Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "", "valueToTitleMap", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/o;", "(Ljava/util/Map;)Ljava/util/List;", "options", "resolver", "forceRequired", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "(Lru/cyberity/cbr/core/data/model/h$d;Lru/cyberity/cbr/core/data/source/dynamic/c$c;Ljava/util/List;LY41/p;Ljava/lang/Boolean;)Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "format", "(Lru/cyberity/cbr/core/data/model/h$d;Lru/cyberity/cbr/core/data/source/dynamic/c$c;Ljava/lang/String;LY41/p;)Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "(Lru/cyberity/cbr/core/data/model/h$d;Lru/cyberity/cbr/core/data/source/dynamic/c$c;)Ljava/lang/String;", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* compiled from: ApplicantDataFieldToFormItemExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "item", "name", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements p<String, String, String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.C12476c f435606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c.C12476c c12476c) {
            super(2);
            this.f435606a = c12476c;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@k String str, @l String str2) {
            c.C12476c c12476c = this.f435606a;
            u0 u0Var = u0.f406856a;
            return c12476c.a(String.format("sns_data_%s_%s", Arrays.copyOf(new Object[]{str, str2}, 2)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[PHI: r11
  0x0057: PHI (r11v9 java.lang.String) = (r11v1 java.lang.String), (r11v12 java.lang.String) binds: [B:30:0x0065, B:24:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ru.cyberity.cbr.core.presentation.form.model.FormItem a(@Y61.k ru.cyberity.cbr.core.data.model.h.d r30, @Y61.l java.lang.String r31, @Y61.l ru.cyberity.cbr.core.data.model.e r32, @Y61.k ru.cyberity.cbr.domain.c r33, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c.C12476c r34, @Y61.l Y41.p<? super java.lang.String, ? super java.lang.String, java.lang.String> r35, @Y61.l java.lang.CharSequence r36, @Y61.l java.lang.Boolean r37, @Y61.l Y41.l<? super ru.cyberity.cbr.core.data.model.FieldName, java.lang.String> r38) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.utils.b.a(ru.cyberity.cbr.core.data.model.h$d, java.lang.String, ru.cyberity.cbr.core.data.model.e, ru.cyberity.cbr.domain.c, ru.cyberity.cbr.core.data.source.dynamic.c$c, Y41.p, java.lang.CharSequence, java.lang.Boolean, Y41.l):ru.cyberity.cbr.core.presentation.form.model.FormItem");
    }

    public static /* synthetic */ h a(h.d dVar, c.C12476c c12476c, List list, p pVar, Boolean bool, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            bool = null;
        }
        return a(dVar, c12476c, list, pVar, bool);
    }

    private static final ru.cyberity.cbr.core.data.source.applicant.remote.h a(h.d dVar, c.C12476c c12476c, List<o> list, p<? super String, ? super String, String> pVar, Boolean bool) {
        FieldName name = dVar.getName();
        String value = name != null ? name.getValue() : null;
        FieldName name2 = dVar.getName();
        String strInvoke = pVar.invoke("field", name2 != null ? name2.getValue() : null);
        FieldName name3 = dVar.getName();
        return new ru.cyberity.cbr.core.data.source.applicant.remote.h(value, strInvoke, pVar.invoke("hint", name3 != null ? name3.getValue() : null), (String) null, Boolean.valueOf(bool != null ? bool.booleanValue() : dVar.getIsRequired()), (String) null, a(dVar, c12476c), (String) null, list, 168, (C42822w) null);
    }

    public static /* synthetic */ ru.cyberity.cbr.core.data.source.applicant.remote.h a(h.d dVar, c.C12476c c12476c, String str, p pVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        return a(dVar, c12476c, str, pVar);
    }

    private static final ru.cyberity.cbr.core.data.source.applicant.remote.h a(h.d dVar, c.C12476c c12476c, String str, p<? super String, ? super String, String> pVar) {
        String strB = dVar.b();
        FieldName name = dVar.getName();
        String strInvoke = pVar.invoke("field", name != null ? name.getValue() : null);
        FieldName name2 = dVar.getName();
        return new ru.cyberity.cbr.core.data.source.applicant.remote.h(strB, strInvoke, pVar.invoke("hint", name2 != null ? name2.getValue() : null), (String) null, Boolean.valueOf(dVar.getIsRequired()), str, a(dVar, c12476c), (String) null, (List) null, 392, (C42822w) null);
    }

    private static final String a(h.d dVar, c.C12476c c12476c) {
        String str = dVar.getCom.avito.android.remote.model.messenger.context.ChannelContext.Item.PLACEHOLDER java.lang.String();
        if (str != null) {
            return str;
        }
        if (dVar.getIsRequired()) {
            return c12476c.a("sns_data_placeholder_required");
        }
        return c12476c.a("sns_data_placeholder_optional");
    }

    private static final List<o> a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new o(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
