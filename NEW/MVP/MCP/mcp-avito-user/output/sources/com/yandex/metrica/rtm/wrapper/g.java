package com.yandex.metrica.rtm.wrapper;

import com.yandex.metrica.rtm.client.DataSender;
import com.yandex.metrica.rtm.client.ReporterDescriptor;
import j.N;

/* loaded from: classes7.dex */
public class g implements d {
    public g(@N String str, boolean z12) {
        new DataSender(new m(), new ReporterDescriptor(str, z12));
    }
}
