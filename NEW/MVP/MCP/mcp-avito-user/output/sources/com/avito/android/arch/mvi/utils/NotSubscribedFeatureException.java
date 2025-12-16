package com.avito.android.arch.mvi.utils;

import kotlin.Metadata;

/* compiled from: NotSubscribedFeatureException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/arch/mvi/utils/NotSubscribedFeatureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotSubscribedFeatureException extends Exception {
    public NotSubscribedFeatureException(@Y61.k String str) {
        super(AK.c.k("Отправка ", str, ", но на Feature никто не подписан. Замените эмит таких экшенов на логику в Bootstrap-е"));
    }
}
