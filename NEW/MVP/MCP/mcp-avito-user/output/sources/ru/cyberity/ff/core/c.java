package ru.cyberity.ff.core;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: FeatureFlagValue.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/ff/core/c;", "", "", "name", "", "isEnabled", "value", "Lru/cyberity/ff/core/FeatureFlagValueType;", "type", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lru/cyberity/ff/core/FeatureFlagValueType;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Z", "d", "()Z", "c", "Lru/cyberity/ff/core/FeatureFlagValueType;", "()Lru/cyberity/ff/core/FeatureFlagValueType;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final FeatureFlagValueType type;

    public c(@k String str, boolean z12, @l String str2, @k FeatureFlagValueType featureFlagValueType) {
        this.name = str;
        this.isEnabled = z12;
        this.value = str2;
        this.type = featureFlagValueType;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }
}
