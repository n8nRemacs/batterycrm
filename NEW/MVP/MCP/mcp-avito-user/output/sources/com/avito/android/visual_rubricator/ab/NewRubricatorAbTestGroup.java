package com.avito.android.visual_rubricator.ab;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import u3.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewRubricatorAbTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/visual_rubricator/ab/NewRubricatorAbTestGroup;", "", "Lu3/j;", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NewRubricatorAbTestGroup implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final NewRubricatorAbTestGroup f327339c;

    /* renamed from: d, reason: collision with root package name */
    public static final NewRubricatorAbTestGroup f327340d;

    /* renamed from: e, reason: collision with root package name */
    public static final NewRubricatorAbTestGroup f327341e;

    /* renamed from: f, reason: collision with root package name */
    public static final NewRubricatorAbTestGroup f327342f;

    /* renamed from: g, reason: collision with root package name */
    public static final NewRubricatorAbTestGroup f327343g;

    /* renamed from: h, reason: collision with root package name */
    public static final NewRubricatorAbTestGroup f327344h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ NewRubricatorAbTestGroup[] f327345i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f327346j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f327347b;

    static {
        NewRubricatorAbTestGroup newRubricatorAbTestGroup = new NewRubricatorAbTestGroup("CONTROL", 0, "control");
        f327339c = newRubricatorAbTestGroup;
        NewRubricatorAbTestGroup newRubricatorAbTestGroup2 = new NewRubricatorAbTestGroup("TEST_V1A", 1, "test_v1a");
        f327340d = newRubricatorAbTestGroup2;
        NewRubricatorAbTestGroup newRubricatorAbTestGroup3 = new NewRubricatorAbTestGroup("TEST_V1B", 2, "test_v1b");
        f327341e = newRubricatorAbTestGroup3;
        NewRubricatorAbTestGroup newRubricatorAbTestGroup4 = new NewRubricatorAbTestGroup("TEST_V2", 3, "test_v2");
        f327342f = newRubricatorAbTestGroup4;
        NewRubricatorAbTestGroup newRubricatorAbTestGroup5 = new NewRubricatorAbTestGroup("TEST_V3", 4, "test_v3");
        f327343g = newRubricatorAbTestGroup5;
        NewRubricatorAbTestGroup newRubricatorAbTestGroup6 = new NewRubricatorAbTestGroup("NONE", 5, "");
        f327344h = newRubricatorAbTestGroup6;
        NewRubricatorAbTestGroup[] newRubricatorAbTestGroupArr = {newRubricatorAbTestGroup, newRubricatorAbTestGroup2, newRubricatorAbTestGroup3, newRubricatorAbTestGroup4, newRubricatorAbTestGroup5, newRubricatorAbTestGroup6};
        f327345i = newRubricatorAbTestGroupArr;
        f327346j = c.a(newRubricatorAbTestGroupArr);
    }

    public NewRubricatorAbTestGroup(String str, int i12, String str2) {
        this.f327347b = str2;
    }

    public static NewRubricatorAbTestGroup valueOf(String str) {
        return (NewRubricatorAbTestGroup) Enum.valueOf(NewRubricatorAbTestGroup.class, str);
    }

    public static NewRubricatorAbTestGroup[] values() {
        return (NewRubricatorAbTestGroup[]) f327345i.clone();
    }

    public final boolean a() {
        return this == f327340d || this == f327341e || this == f327342f || this == f327343g;
    }

    @Override // u3.j
    @k
    /* renamed from: n, reason: from getter */
    public final String getF327347b() {
        return this.f327347b;
    }
}
