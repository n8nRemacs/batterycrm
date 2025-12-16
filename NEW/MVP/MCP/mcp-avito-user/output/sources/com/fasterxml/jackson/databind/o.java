package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;

/* compiled from: MappingJsonFactory.java */
/* loaded from: classes4.dex */
public class o extends JsonFactory {
    private static final long serialVersionUID = -1;

    public o() {
        super(null);
        this.f341031g = new ObjectMapper(this);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public final com.fasterxml.jackson.core.j d() {
        return this.f341031g;
    }
}
