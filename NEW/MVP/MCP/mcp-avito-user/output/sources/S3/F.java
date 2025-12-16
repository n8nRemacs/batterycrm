package s3;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: MessengerFolderTabsTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/F;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/MessengerFolderTabsTestGroup;", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes10.dex */
public final class F extends AbstractC48780d<MessengerFolderTabsTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f437324a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437325b = "messenger_folders";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437326c = true;

    public F(@Y61.k C30277e1 c30277e1) {
        this.f437324a = c30277e1;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437326c() {
        return this.f437326c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437325b() {
        return this.f437325b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        C30277e1 c30277e1 = this.f437324a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[18];
        return d(((OptionSet) c30277e1.f145039t.a().invoke()).f318873b);
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return MessengerFolderTabsTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return MessengerFolderTabsTestGroup.f67951c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        C30277e1 c30277e1 = this.f437324a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[17];
        return ((Boolean) c30277e1.f145037s.a().invoke()).booleanValue();
    }
}
