package com.avito.android.search.filter.converter;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryConverterUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/a;", "", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f262889a = new a();

    @Y61.k
    public static String a(int i12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        int i13 = i12 % 10;
        switch (i12 % 100) {
            case 11:
            case 12:
            case 13:
            case 14:
                if (str3 == null) {
                    break;
                }
                break;
            default:
                if (i13 != 1) {
                    if (i13 != 2 && i13 != 3 && i13 != 4) {
                        if (str3 != null) {
                            break;
                        }
                    } else if (str2 != null) {
                        break;
                    }
                } else if (str != null) {
                }
                break;
        }
        return "";
    }
}
