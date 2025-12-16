package ru.cyberity.cbr.core.data.source.settings;

import Y61.k;
import Y61.l;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: SettingsRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H&¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/source/settings/b;", "", "", "e", "()Ljava/lang/String;", "b", "a", "id", "Lkotlin/G0;", "c", "(Ljava/lang/String;)V", "d", "()V", "", "h", "()Z", "Ljava/util/UUID;", "f", "()Ljava/util/UUID;", "(Ljava/util/UUID;)V", "g", "type", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface b {
    @k
    String a();

    void a(@k UUID id2);

    @k
    String b();

    void b(@k String type);

    void c(@l String id2);

    void d();

    void d(@l String id2);

    @k
    String e();

    @l
    UUID f();

    @k
    String g();

    boolean h();
}
