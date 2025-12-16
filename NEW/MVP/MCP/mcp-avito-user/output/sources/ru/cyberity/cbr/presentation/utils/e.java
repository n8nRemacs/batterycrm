package ru.cyberity.cbr.presentation.utils;

import Y61.k;
import Y61.l;
import android.util.Patterns;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.remote.model.Navigation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.model.q;
import ru.cyberity.cbr.core.data.model.remote.n;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.util.ApplicantDataFieldFormatUtilsKt;
import ru.cyberity.cbr.domain.j;

/* compiled from: ApplicantDataUtils.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u000b\u001a/\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0007\u0010\u000f\u001a/\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"", "country", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "Lru/cyberity/cbr/domain/j;", "a", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/model/e;Lru/cyberity/cbr/core/data/source/dynamic/c$c;)Lru/cyberity/cbr/domain/j;", "Lru/cyberity/cbr/core/data/model/h$c;", "value", "(Lru/cyberity/cbr/core/data/model/h$c;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/dynamic/c$c;)Ljava/lang/String;", "Lru/cyberity/cbr/core/data/model/h$d;", "", "validPhone", "(Lru/cyberity/cbr/core/data/model/h$d;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/dynamic/c$c;Ljava/lang/Boolean;)Ljava/lang/String;", "Lru/cyberity/cbr/core/data/model/h;", "(Lru/cyberity/cbr/core/data/model/h;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/dynamic/c$c;Ljava/lang/Boolean;)Ljava/lang/String;", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e {
    @k
    public static final j a(@k String str, @l ru.cyberity.cbr.core.data.model.e eVar, @k c.C12476c c12476c) {
        String strA;
        String str2;
        List<String> listC;
        List<String> listC2;
        Map<String, Map<String, String>> mapT;
        Map<String, String> map;
        Map<String, n> mapD;
        n nVar = (eVar == null || (mapD = eVar.D()) == null) ? null : mapD.get(str);
        if (eVar == null || (mapT = eVar.t()) == null || (map = mapT.get(str)) == null || (strA = map.get("tin")) == null) {
            u0 u0Var = u0.f406856a;
            strA = c12476c.a(String.format("sns_data_%s_%s", Arrays.copyOf(new Object[]{"field", "tin"}, 2)));
        }
        String str3 = "";
        if (nVar == null || (listC2 = nVar.c()) == null || (str2 = (String) C42745f0.G(listC2)) == null) {
            str2 = "";
        }
        if (nVar != null && (listC = nVar.c()) != null) {
            String strO = C42745f0.O(listC, ", ", null, null, a.f435618a, 30);
            u0 u0Var2 = u0.f406856a;
            String strA2 = c12476c.a(String.format("sns_data_%s_%s", Arrays.copyOf(new Object[]{"hint", "tin"}, 2)));
            String strA0 = strA2 != null ? C43066x.a0(strA2, "{example}", strO, false) : null;
            if (strA0 != null) {
                str3 = strA0;
            }
        }
        return new j(strA, nVar, str2, str3);
    }

    private static final String a(h.c cVar, String str, c.C12476c c12476c) {
        if (C43066x.K(str) && L.f(cVar.getIsRequired(), Boolean.TRUE)) {
            return c12476c.a("sns_data_error_fieldIsRequired");
        }
        return null;
    }

    private static final String a(h.d dVar, String str, c.C12476c c12476c, Boolean bool) throws ParseException {
        String error;
        q format = dVar.getFormat();
        if (format == null || (error = ApplicantDataFieldFormatUtilsKt.getError(format, c12476c.d(), str, Boolean.FALSE)) == null || error.length() <= 0) {
            error = null;
        }
        if (error != null) {
            return error;
        }
        if ((dVar.getIsRequired() && str.length() == 0) || (dVar.getIsRequired() && dVar.getName() == FieldName.phone && L.f(bool, Boolean.FALSE))) {
            return c12476c.a("sns_data_error_fieldIsRequired");
        }
        if (dVar.y() && str.length() > 0) {
            try {
                Date date = new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, Locale.getDefault()).parse(str);
                if (date == null) {
                    return null;
                }
                if (date.compareTo(Calendar.getInstance().getTime()) < 0) {
                    date = null;
                }
                if (date != null) {
                    return c12476c.a("sns_data_error_fieldIsMalformed");
                }
                return null;
            } catch (Exception unused) {
                return c12476c.a("sns_data_error_fieldIsMalformed");
            }
        }
        if (dVar.getName() == FieldName.email && str.length() > 0) {
            boolean zMatches = Patterns.EMAIL_ADDRESS.matcher(str).matches();
            Boolean boolValueOf = Boolean.valueOf(zMatches);
            if (zMatches) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                return c12476c.a("sns_data_error_fieldIsMalformed");
            }
            return null;
        }
        if (dVar.getName() == FieldName.phone && str.length() > 0 && L.f(bool, Boolean.FALSE)) {
            return c12476c.a("sns_data_error_fieldIsMalformed");
        }
        return null;
    }

    @l
    public static final String a(@k h hVar, @k String str, @k c.C12476c c12476c, @l Boolean bool) {
        if (hVar instanceof h.d) {
            return a((h.d) hVar, str, c12476c, bool);
        }
        if (hVar instanceof h.c) {
            return a((h.c) hVar, str, c12476c);
        }
        if (hVar instanceof h.e) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ApplicantDataUtils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f435618a = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@k String str) {
            return str;
        }
    }
}
