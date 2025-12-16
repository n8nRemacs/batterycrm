package com.iab.omid.library.corpmailru.adsession;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.iab.omid.library.corpmailru.b.c;
import com.iab.omid.library.corpmailru.b.f;
import com.iab.omid.library.corpmailru.d.e;
import com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher;
import com.iab.omid.library.corpmailru.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f363952a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionContext f363953b;

    /* renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f363954c;

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.corpmailru.e.a f363956e;

    /* renamed from: f, reason: collision with root package name */
    private AdSessionStatePublisher f363957f;

    /* renamed from: j, reason: collision with root package name */
    private boolean f363961j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f363962k;

    /* renamed from: d, reason: collision with root package name */
    private final List<c> f363955d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f363958g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f363959h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String f363960i = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f363954c = adSessionConfiguration;
        this.f363953b = adSessionContext;
        c(null);
        this.f363957f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.corpmailru.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f363957f.a();
        com.iab.omid.library.corpmailru.b.a.a().a(this);
        this.f363957f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f363955d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void j() {
        if (this.f363961j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.f363962k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f363959h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f363955d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public void b() {
        j();
        getAdSessionStatePublisher().g();
        this.f363961j = true;
    }

    public void c() {
        k();
        getAdSessionStatePublisher().h();
        this.f363962k = true;
    }

    public View d() {
        return this.f363956e.get();
    }

    public boolean e() {
        return this.f363958g && !this.f363959h;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f363959h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f363958g;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void finish() {
        if (this.f363959h) {
            return;
        }
        this.f363956e.clear();
        removeAllFriendlyObstructions();
        this.f363959h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.corpmailru.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f363957f = null;
    }

    public boolean g() {
        return this.f363959h;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public String getAdSessionId() {
        return this.f363960i;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f363957f;
    }

    public boolean h() {
        return this.f363954c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f363954c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f363959h) {
            return;
        }
        e.a(view, "AdView is null");
        if (d() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f363959h) {
            return;
        }
        this.f363955d.clear();
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f363959h) {
            return;
        }
        b(view);
        c cVarA = a(view);
        if (cVarA != null) {
            this.f363955d.remove(cVarA);
        }
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void start() {
        if (this.f363958g) {
            return;
        }
        this.f363958g = true;
        com.iab.omid.library.corpmailru.b.a.a().b(this);
        this.f363957f.a(f.a().d());
        this.f363957f.a(this, this.f363953b);
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f363956e = new com.iab.omid.library.corpmailru.e.a(view);
    }

    private void d(View view) {
        Collection<a> collectionB = com.iab.omid.library.corpmailru.b.a.a().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.d() == view) {
                aVar.f363956e.clear();
            }
        }
    }

    public List<c> a() {
        return this.f363955d;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f363952a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.f363962k = true;
    }
}
