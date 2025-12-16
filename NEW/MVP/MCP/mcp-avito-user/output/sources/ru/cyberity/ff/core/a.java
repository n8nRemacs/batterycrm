package ru.cyberity.ff.core;

import Y61.k;
import Y61.l;
import j.k0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: FeatureFlag.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ!\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u000f\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0011\u0010\u0015R\u0011\u0010\r\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u0018¨\u0006$"}, d2 = {"Lru/cyberity/ff/core/a;", "", "", "name", "humanReadableDescription", "", "localOnly", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Lkotlin/G0;", "i", "()V", "isEnabled", "value", "c", "(ZLjava/lang/String;)V", "b", "a", "Lru/cyberity/ff/core/c;", "h", "()Lru/cyberity/ff/core/c;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Z", "d", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "remoteValue", "clientOverrideValue", "f", "localOverrideValue", "g", "Lru/cyberity/ff/core/c;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String humanReadableDescription;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean localOnly;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final AtomicReference<c> remoteValue = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final AtomicReference<c> clientOverrideValue = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final AtomicReference<c> localOverrideValue = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final c defaultValue;

    public a(@k String str, @k String str2, boolean z12, @l String str3) {
        this.name = str;
        this.humanReadableDescription = str2;
        this.localOnly = z12;
        this.defaultValue = new c(str, false, str3, FeatureFlagValueType.DEFAULT);
    }

    public final void a() {
        this.localOverrideValue.set(null);
    }

    @k
    /* renamed from: b, reason: from getter */
    public final c getDefaultValue() {
        return this.defaultValue;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getHumanReadableDescription() {
        return this.humanReadableDescription;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getLocalOnly() {
        return this.localOnly;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    public final String f() {
        return h().getValue();
    }

    public final boolean g() {
        return h().getIsEnabled();
    }

    @k0
    @k
    public final c h() {
        c cVar;
        c cVar2 = this.localOverrideValue.get();
        if (cVar2 != null) {
            return cVar2;
        }
        c cVar3 = this.clientOverrideValue.get();
        return cVar3 != null ? cVar3 : (this.localOnly || (cVar = this.remoteValue.get()) == null) ? this.defaultValue : cVar;
    }

    public final void i() {
        this.remoteValue.set(null);
        this.localOverrideValue.set(null);
        this.clientOverrideValue.set(null);
    }

    public static /* synthetic */ void a(a aVar, boolean z12, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        aVar.a(z12, str);
    }

    public final void b(boolean isEnabled, @l String value) {
        this.localOverrideValue.set(new c(this.name, isEnabled, value, FeatureFlagValueType.LOCAL_OVERRIDE));
    }

    public final void c(boolean isEnabled, @l String value) {
        this.remoteValue.set(new c(this.name, isEnabled, value, FeatureFlagValueType.REMOTE));
    }

    public final void a(boolean isEnabled, @l String value) {
        this.clientOverrideValue.set(new c(this.name, isEnabled, value, FeatureFlagValueType.CLIENT_OVERRIDE));
    }
}
