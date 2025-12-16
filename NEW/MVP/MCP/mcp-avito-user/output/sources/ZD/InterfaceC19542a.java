package Zd;

import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.authorization.AuthSource;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: AuthIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZd/a;", "", "_avito_authorization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zd.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC19542a {

    /* compiled from: AuthIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zd.a$a, reason: collision with other inner class name */
    public static final class C1444a {
        public static /* synthetic */ Intent a(InterfaceC19542a interfaceC19542a, String str, int i12) {
            if ((i12 & 1) != 0) {
                str = null;
            }
            return interfaceC19542a.c(str, null, false);
        }
    }

    @Y61.k
    Intent a(@Y61.k AuthSource authSource);

    @Y61.k
    @InterfaceC42830m
    Intent b(@Y61.l Parcelable parcelable, @Y61.l String str);

    @Y61.k
    Intent c(@Y61.l String str, @Y61.l String str2, boolean z12);

    @Y61.k
    Intent d();

    @Y61.k
    @InterfaceC42830m
    Intent e(@Y61.l AuthSource authSource, @Y61.l Intent intent);
}
