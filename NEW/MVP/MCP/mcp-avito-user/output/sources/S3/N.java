package s3;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;

/* compiled from: PublishRedesignV2TestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ls3/N;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "<init>", "()V", "_avito-discouraged_avito-feature_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f437348a = "redesign_item_add_components_w2_android";

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437349b;

    /* compiled from: PublishRedesignV2TestConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<SimpleTestGroupWithNone> f437350a = kotlin.enums.c.a(SimpleTestGroupWithNone.values());
    }

    public N() {
        Owners owners = Owners.f210476d;
        this.f437349b = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437439b() {
        return this.f437349b;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437438a() {
        return this.f437348a;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return (SimpleTestGroupWithNone[]) ((AbstractC42734a) a.f437350a).toArray(new SimpleTestGroupWithNone[0]);
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        return true;
    }
}
