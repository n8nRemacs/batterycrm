package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class Q7 implements InterfaceC38798f8 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f379250a;

    /* renamed from: b, reason: collision with root package name */
    private final String f379251b;

    /* renamed from: c, reason: collision with root package name */
    private final B0 f379252c;

    public Q7(@Y61.k Context context, @Y61.k String str, @Y61.k B0 b02) {
        this.f379250a = context;
        this.f379251b = str;
        this.f379252c = b02;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38798f8
    public void a(@Y61.k String str) {
        try {
            File fileA = this.f379252c.a(this.f379250a, this.f379251b);
            if (fileA != null) {
                kotlin.io.j.f(fileA, str);
            }
        } catch (FileNotFoundException unused) {
            ((C39006nh) C39031oh.a()).reportEvent("vital_data_provider_write_file_not_found", Collections.singletonMap("fileName", this.f379251b));
        } catch (Throwable th2) {
            ((C39006nh) C39031oh.a()).reportEvent("vital_data_provider_write_exception", kotlin.collections.P0.g(new kotlin.Q("fileName", this.f379251b), new kotlin.Q("exception", kotlin.jvm.internal.m0.f406844a.b(th2.getClass()).l0())));
            ((C39006nh) C39031oh.a()).reportError("Error during writing file with name " + this.f379251b, th2);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38798f8
    @Y61.l
    public String c() {
        try {
            File fileA = this.f379252c.a(this.f379250a, this.f379251b);
            if (fileA != null) {
                return kotlin.io.j.d(fileA);
            }
            return null;
        } catch (FileNotFoundException unused) {
            ((C39006nh) C39031oh.a()).reportEvent("vital_data_provider_read_file_not_found", Collections.singletonMap("fileName", this.f379251b));
            return null;
        } catch (Throwable th2) {
            ((C39006nh) C39031oh.a()).reportEvent("vital_data_provider_read_exception", kotlin.collections.P0.g(new kotlin.Q("fileName", this.f379251b), new kotlin.Q("exception", kotlin.jvm.internal.m0.f406844a.b(th2.getClass()).l0())));
            ((C39006nh) C39031oh.a()).reportError("Error during reading file with name " + this.f379251b, th2);
            return null;
        }
    }
}
