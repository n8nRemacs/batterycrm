package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: LocalTimeExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-incoming-call-ability_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u {
    @Y61.l
    public static final org.threeten.bp.g a(@Y61.l String str, @Y61.k SimpleDateFormat simpleDateFormat, @Y61.k SimpleDateFormat simpleDateFormat2) throws ParseException {
        if (str == null) {
            return null;
        }
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            String str2 = simpleDateFormat2.format(date);
            org.threeten.bp.g gVar = org.threeten.bp.g.f422067f;
            org.threeten.bp.format.c cVar = org.threeten.bp.format.c.f421977g;
            w81.d.f(cVar, "formatter");
            return (org.threeten.bp.g) cVar.c(str2, org.threeten.bp.g.f422070i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Y61.k
    public static final String b(@Y61.k org.threeten.bp.g gVar, @Y61.k SimpleDateFormat simpleDateFormat, @Y61.k SimpleDateFormat simpleDateFormat2) throws ParseException {
        Date date = simpleDateFormat2.parse(gVar.toString());
        return date == null ? "" : simpleDateFormat.format(date);
    }
}
