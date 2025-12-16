package androidx.view;

import Y41.l;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavDeepLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "argName", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23304O extends N implements l<String, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bundle f52853l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23304O(Bundle bundle) {
        super(1);
        this.f52853l = bundle;
    }

    @Override // Y41.l
    public final Boolean invoke(String str) {
        return Boolean.valueOf(!this.f52853l.containsKey(str));
    }
}
