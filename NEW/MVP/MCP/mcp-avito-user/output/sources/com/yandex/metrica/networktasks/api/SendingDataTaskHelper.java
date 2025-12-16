package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.impl.ob.Ql;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.impl.h;
import java.io.IOException;

/* loaded from: classes7.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    public final RequestBodyEncrypter f382441a;

    /* renamed from: b, reason: collision with root package name */
    public final Ql f382442b;

    /* renamed from: c, reason: collision with root package name */
    public final h f382443c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f382444d;

    /* renamed from: e, reason: collision with root package name */
    public final ResponseDataHolder f382445e;

    /* renamed from: f, reason: collision with root package name */
    public final DefaultNetworkResponseHandler f382446f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Ql ql2, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, DefaultNetworkResponseHandler defaultNetworkResponseHandler) {
        h hVar = new h();
        this.f382441a = requestBodyEncrypter;
        this.f382442b = ql2;
        this.f382443c = hVar;
        this.f382444d = requestDataHolder;
        this.f382445e = responseDataHolder;
        this.f382446f = defaultNetworkResponseHandler;
    }

    public final boolean a(byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f382442b.compress(bArr);
            if (bArrCompress == null || (bArrEncrypt = this.f382441a.encrypt(bArrCompress)) == null) {
                return false;
            }
            RequestDataHolder requestDataHolder = this.f382444d;
            requestDataHolder.f382430a = NetworkTask.Method.f382425c;
            requestDataHolder.f382432c = bArrEncrypt;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
