package com.yandex.metrica.impl.ob;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes7.dex */
public class F1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f378111a;

    /* renamed from: b, reason: collision with root package name */
    private final int f378112b;

    /* renamed from: c, reason: collision with root package name */
    private final int f378113c;

    public F1(int i12, int i13, int i14) {
        this.f378111a = i12;
        this.f378112b = i13;
        this.f378113c = i14;
    }

    public final int a(@Y61.l Boolean bool) {
        if (bool == null) {
            return this.f378111a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f378112b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f378113c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.l
    public final Boolean a(int i12) {
        if (i12 == this.f378112b) {
            return Boolean.FALSE;
        }
        if (i12 == this.f378113c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
