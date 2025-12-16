package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DateTimeFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/U;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class U extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final U f369599b = new U();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369600c = "formatDateAsLocalWithLocale";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369601d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369602e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369603f;

    static {
        com.yandex.div.evaluable.h hVar = new com.yandex.div.evaluable.h(EvaluableType.DATETIME, false, 2, null);
        EvaluableType evaluableType = EvaluableType.STRING;
        f369601d = C42745f0.U(hVar, new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369602e = evaluableType;
        f369603f = true;
    }

    public U() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        com.yandex.div.evaluable.types.b bVar = (com.yandex.div.evaluable.types.b) list.get(0);
        String str = (String) list.get(1);
        String str2 = (String) list.get(2);
        C.a(str);
        Date dateC = C.c(bVar);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new Locale.Builder().setLanguageTag(str2).build());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(dateC);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369601d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369600c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369602e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369603f;
    }
}
