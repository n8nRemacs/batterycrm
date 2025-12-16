package Su;

import Y61.k;
import android.content.UriMatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lE.C43624b;

/* compiled from: DynamicDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSu/a;", "", "a", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Su.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15224a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43624b f15179a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UriMatcher f15180b;

    /* compiled from: DynamicDeepLinkParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LSu/a$a;", "", "<init>", "()V", "", "CODE_CHANNELS_ID", "I", "CODE_GUESTS_SELECTOR_ID", "CODE_ITEMS_ID", "CODE_PROFILE_ITEMS_ID", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Su.a$a, reason: collision with other inner class name */
    public static final class C1035a {
        public /* synthetic */ C1035a(C42822w c42822w) {
            this();
        }

        public C1035a() {
        }
    }

    static {
        new C1035a(null);
    }

    public C15224a(@k C43624b c43624b) {
        this.f15179a = c43624b;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("1", "items/#", 0);
        uriMatcher.addURI("1", "profile/items/#", 1);
        uriMatcher.addURI("1", "channels/*", 2);
        uriMatcher.addURI("1", "guests-selector", 3);
        this.f15180b = uriMatcher;
    }
}
