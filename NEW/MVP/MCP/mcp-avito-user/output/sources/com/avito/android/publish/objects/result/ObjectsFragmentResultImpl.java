package com.avito.android.publish.objects.result;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22983P;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.enums.c;
import kotlin.jvm.internal.s0;

/* compiled from: ObjectsFragmentResult.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/objects/result/ObjectsFragmentResultImpl;", "Lcom/avito/android/publish/objects/result/a;", "ObjectsRequestKey", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ObjectsFragmentResultImpl implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FragmentManager f238084a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC22983P f238085b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ObjectsFragmentResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/result/ObjectsFragmentResultImpl$ObjectsRequestKey;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ObjectsRequestKey {

        /* renamed from: c, reason: collision with root package name */
        public static final ObjectsRequestKey f238086c;

        /* renamed from: d, reason: collision with root package name */
        public static final ObjectsRequestKey f238087d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ObjectsRequestKey[] f238088e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f238089f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f238090b;

        static {
            ObjectsRequestKey objectsRequestKey = new ObjectsRequestKey("FROM_OBJECTS_FILL_FORM", 0, "req_from_objects_fill_form");
            f238086c = objectsRequestKey;
            ObjectsRequestKey objectsRequestKey2 = new ObjectsRequestKey("FROM_SELECT_PRICE_LIST", 1, "req_from_select_price_list");
            f238087d = objectsRequestKey2;
            ObjectsRequestKey[] objectsRequestKeyArr = {objectsRequestKey, objectsRequestKey2};
            f238088e = objectsRequestKeyArr;
            f238089f = c.a(objectsRequestKeyArr);
        }

        public ObjectsRequestKey(String str, int i12, String str2) {
            this.f238090b = str2;
        }

        public static ObjectsRequestKey valueOf(String str) {
            return (ObjectsRequestKey) Enum.valueOf(ObjectsRequestKey.class, str);
        }

        public static ObjectsRequestKey[] values() {
            return (ObjectsRequestKey[]) f238088e.clone();
        }
    }

    @Inject
    public ObjectsFragmentResultImpl(@k FragmentManager fragmentManager, @k InterfaceC22983P interfaceC22983P) {
        this.f238084a = fragmentManager;
        this.f238085b = interfaceC22983P;
    }

    @Override // com.avito.android.publish.objects.result.a
    public final void a(@k ObjectsRequestKey objectsRequestKey, @k String str) {
        this.f238084a.o0(C22777e.b(new Q("objects_parameter_key", str)), objectsRequestKey.f238090b);
    }

    @Override // com.avito.android.publish.objects.result.a
    public final void b(@k l lVar, @k List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ObjectsRequestKey objectsRequestKey = (ObjectsRequestKey) it.next();
            this.f238084a.p0(objectsRequestKey.f238090b, this.f238085b, new com.avito.android.gig_shift_action.ui.a(objectsRequestKey, lVar));
        }
    }
}
