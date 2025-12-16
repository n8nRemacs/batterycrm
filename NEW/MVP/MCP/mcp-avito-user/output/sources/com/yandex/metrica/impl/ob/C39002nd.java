package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ResponseValidityChecker;

/* renamed from: com.yandex.metrica.impl.ob.nd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39002nd implements ResponseValidityChecker {
    @Override // com.yandex.metrica.networktasks.api.ResponseValidityChecker
    public boolean isResponseValid(int i12) {
        return (i12 == 400 || i12 == 500) ? false : true;
    }
}
