package com.google.android.play.core.splitinstall.testing;

import j.P;
import java.util.Map;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class f extends y {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f358859b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f358860c;

    public /* synthetic */ f(Integer num, Map map, e eVar) {
        this.f358859b = num;
        this.f358860c = map;
    }

    @Override // com.google.android.play.core.splitinstall.testing.y
    @PY0.a
    @P
    public final Integer a() {
        return this.f358859b;
    }

    @Override // com.google.android.play.core.splitinstall.testing.y
    public final Map b() {
        return this.f358860c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            Integer num = this.f358859b;
            if (num != null ? num.equals(yVar.a()) : yVar.a() == null) {
                if (this.f358860c.equals(yVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f358859b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f358860c.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f358859b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f358860c) + "}";
    }
}
